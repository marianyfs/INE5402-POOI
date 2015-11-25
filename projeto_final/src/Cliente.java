import java.util.Arrays;

public class Cliente {

	protected int id;
	protected String nome;
	protected Produto arrayProduto[] = null;
	protected double valorCompras;
	public static int numClientes = 0, numEspeciais = 0;

	// -----------------------------------------------------
	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.arrayProduto = new Produto[6];
		this.valorCompras = 0.0;
		numClientes++;
	}

	// -----------------------------------------------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto[] getArrayProduto() {
		return arrayProduto;
	}

	public void setArrayProduto(Produto[] arrayProduto) {
		this.arrayProduto = arrayProduto;
		valorCompras = 0;
		for (Produto produto : arrayProduto) {
			valorCompras += produto.getPreco();
		}
	}

	public double getValorCompras() {
		return valorCompras;
	}

	public void setValorCompras(double valorCompras) {
		this.valorCompras = valorCompras;
	}

	// -----------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "ID do Cliente: " + id + "\n" + "Nome = " + nome + "\n" + "Array de Produtos = "
				+ Arrays.toString(arrayProduto) + "\n\n";
	}

	// -----------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object cliente) {

		Cliente clienteC;

		if (cliente instanceof Cliente || cliente instanceof ClienteEspecial) 
			clienteC = (Cliente) cliente;
		 else
			return false;
		
		// Comparacao do tamanho do array de Produtos do Cliente
		if (arrayProduto.length != clienteC.arrayProduto.length)
			return false;

		
		// Comparacao de produtos no array do Cliente
		boolean comparacao = true;
		for (int i = 0; i < clienteC.arrayProduto.length; i++) 
			comparacao = comparacao && arrayProduto[i].equals(clienteC.arrayProduto[i]);
		

		return id == clienteC.id && nome.equals(clienteC.nome) && comparacao && valorCompras == clienteC.valorCompras;
	}
	// -----------------------------------------------------------------------------------------

	public double inserirProduto(Produto p) {

		boolean cadastrado = false;
		// Percorro o Array de Produto até encontrar um espaco null
		for (int linha = 0; linha < arrayProduto.length; linha++) 

			if (arrayProduto[linha] == null) {

				arrayProduto[linha] = p;
				cadastrado = true;
				break;
			}
		
		// Se eu não encontrar um espaco vazio aumento o array de produtos
		if (cadastrado != true) {
			
			Produto[] arrayAuxiliar = new Produto[(arrayProduto.length * 2)];

			for (int i = 0; i < arrayProduto.length; i++) 
				arrayAuxiliar[i] = arrayProduto[i];
			
			arrayProduto = arrayAuxiliar;
			inserirProduto(p);

		}
		// Tratamento para verificacao do valor da compra ate o momento, caso
		// ultrapasse RS100,00 eu transformo Cliente em Cliente Especial
		double valorCompra = 0;

		for (Produto produto : arrayProduto) 
			if (produto != null)
				valorCompra += produto.getPreco();
		

		if (valorCompra >= 100)
			Controle.matrizClientes.upgradeCliente(this);
		return valorCompra;

	}

}
