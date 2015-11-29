
public class ClienteEspecial extends Cliente {

	protected double desconto;

	// ----------------------------------------------------------------------------
	public ClienteEspecial(int id, String nome, Produto[] arrayProduto, double valorCompras, double desconto) {
		super(id, nome);
		this.desconto = desconto;
		numEspeciais++;
	}

	public ClienteEspecial(Cliente c, double desconto) {
		super(c.id, c.nome);
		arrayProduto = c.arrayProduto;

		this.desconto = desconto;
		numEspeciais++;

	}

	// -----------------------------------------------------------------------------------------
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	// -----------------------------------------------------------------------------------------
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	// -----------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object o) {

		return super.equals(o);
	}
	// -----------------------------------------------------------------------------------------
	@Override	
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

		double valorCompra = 0;

		for (Produto produto : arrayProduto) 
			if (produto != null)
				valorCompra += produto.getPreco();

		valorCompra *= ((100-desconto) / 100);

		return valorCompra;

	}
}
