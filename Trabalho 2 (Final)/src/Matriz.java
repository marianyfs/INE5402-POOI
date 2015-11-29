
import javax.swing.JOptionPane;

public class Matriz {

	protected Cliente[][] matrizClientes;
	protected int ordem;

	public Matriz(int ordem) {
		super();
		this.matrizClientes = new Cliente[ordem][ordem];
	}

	public Cliente[][] getMatrizClientes() {
		return matrizClientes;
	}

	public void setMatrizClientes(Cliente[][] matrizClientes) {
		this.matrizClientes = matrizClientes;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		String matriz = "";

		for (Cliente[] clientes : matrizClientes) {
			for (Cliente cliente : clientes) {
				if (cliente != null)
					matriz += cliente.getNome() + " ";
				else
					matriz += "null ";
			}
			matriz += "\n";
		}
		return matriz;
	}

	// -----------------------------------------------------------------------------------------
	public Cliente inserirClientes() {

		boolean cadastrado = false;

		Cliente oCliente = null;

		// Percorro a Matriz de Clientes em busca de um espaço null
		for (int linha = 0; linha < matrizClientes.length; linha++) {
			for (int coluna = 0; coluna < matrizClientes[0].length; coluna++) {

				if (matrizClientes[linha][coluna] == null) {
					// Cadastro o novo Cliente, se cadastrado vai retornar o
					// Cliente se não não vai confirmar a inserção
					oCliente = new Cliente(Integer.parseInt(Integer.toString(linha) + Integer.toString(coluna)),
							JOptionPane.showInputDialog("Digite o nome do novo Cliente"));

					matrizClientes[linha][coluna] = oCliente;
					cadastrado = true;
				}
				if (cadastrado == true)
					break;
			}
			if (cadastrado == true)
				break;
		}

		if (cadastrado == false)
			JOptionPane.showMessageDialog(null, "A Matriz está cheia!");

		return oCliente;
	}

	// -----------------------------------------------------------------------------------------
	public Cliente buscaCliente(int id) {

		Cliente auxiliar = null;

		// Pesquiso na matriz um Cliente com o ID passado
		for (int linha = 0; linha < matrizClientes.length; linha++)
			for (int coluna = 0; coluna < matrizClientes[0].length; coluna++)

				if (matrizClientes[linha][coluna] != null && matrizClientes[linha][coluna].getId() == id)
					auxiliar = matrizClientes[linha][coluna];

		// Se for encontrado retorna o Cliente se não for retorna null
		return auxiliar;
	}

	// -----------------------------------------------------------------------------------------
	public int numClientesCompraram(int id) {
		// Informar a quantidade de clientes que compraram um determinado
		// produto.

		int num = 0;
		/*
		 * Percorro a Matriz de Clientes e o Array de Produtos de cada Cliente
		 * em busca do Produto com id correspondente Se eu encontrar no Cliente
		 * o Produto somo 1 e paro o laço que percorre o Array de Produtos do
		 * Cliente e vou para o proximo Cliente da Matriz
		 */
		for (Cliente[] clientes : matrizClientes)
			for (Cliente cliente : clientes)

				if (cliente != null)
					Loop: for (Produto p : cliente.getArrayProduto())
						if (p != null && p.getId() == id) {
							num++;
							break Loop;
						}
		return num;

	}

	// -----------------------------------------------------------------------------------------
	public String nomeClienteComprou(int id) {
		// Pesquisar a exist�ncia de um determinado produto e retornar o nome do
		// cliente que cont�m este produto.

		String nomes = "";
		/*
		 * Percorro a Matriz de Clientes e o Array de Produtos de cada Cliente
		 * em busca do Produto com id correspondente Se eu encontrar no Cliente
		 * o Produto adiciono a String nomes e paro o laço que percorre o Array
		 * de Produtos do Cliente e vou para o proximo Cliente da Matriz
		 */
		for (Cliente[] clientes : matrizClientes)
			for (Cliente cliente : clientes)

				if (cliente != null)
					Loop: for (Produto p : cliente.getArrayProduto())
						if (p != null && p.getId() == id) {
							nomes += cliente.getNome() + " / ";
							break Loop;
						}

		return nomes;
	}

	// -----------------------------------------------------------------------------------------
	public boolean produtoFoiComprado(int id) {
		// Pesquisar a inexist�ncia de um determinado produto retornando
		// verdadeiro (inexiste nos arrays) ou falso (existe em algum array).

		/*
		 * Chamo o método de informa a Quantidade de Clientes que comprou um
		 * determinado produto se for maior igual a zero retorno true
		 */
		int num = numClientesCompraram(id);
		if (num == 0)
			return true;
		else
			return false;
	}

	// -----------------------------------------------------------------------------------------
	public void ordenaMatriz() {
		// Ordenar a matriz em ordem crescente, considerando os nomes dos
		// clientes.

		Cliente[] clientes = new Cliente[matrizClientes.length * matrizClientes[0].length];

		/*
		 * Decidi tratar a Matriz como um Array para poder facilitar o
		 * ordenamento, e também porque pelo que pesquiser na internet essa é a
		 * maneira mais facil de implementar o Bubble sort
		 */

		for (int i = 0; i < matrizClientes.length; i++)
			for (int j = 0; j < matrizClientes[i].length; j++)
				// tratamento como array
				clientes[(i * matrizClientes.length) + j] = matrizClientes[i][j];

		boolean ordenado = false;

		while (!ordenado) {

			ordenado = true;
			// Aplicacao do Bubble sort no Array temporario de Clientes
			for (int i = 0; i < clientes.length - 1; i++)
				// O Array ordena apenas espaços não nulos
				if (clientes[i] != null && clientes[i + 1] != null)
					// A ordenacao e feita pelo nome do Cliente em caixa baixa
					if (clientes[i].getNome().toLowerCase().compareTo(clientes[i + 1].getNome().toLowerCase()) > 0) {
						// Bubble sort
						Cliente c = clientes[i];
						clientes[i] = clientes[i + 1];
						clientes[i + 1] = c;
					}
					// Caso seja null só repassa o Cleinte
					else if (clientes[i] == null && clientes[i + 1] != null)
						clientes[i + 1] = clientes[i];
		}
		/*
		 * Aqui eu preencho novamente a Matriz, agora ordenada usando o Array de
		 * Clientes que foi ordenado anteriormente
		 */
		for (int i = 0; i < matrizClientes.length; i++) 
			for (int j = 0; j < matrizClientes[i].length; j++) 
				matrizClientes[i][j] = clientes[i * matrizClientes.length + j];
			
		

	}

	// -----------------------------------------------------------------------------------------
	public ClienteEspecial upgradeCliente(Cliente c) {
		
		// Transformacao de um Cliente em Cliente Especial
		double desconto = Double.parseDouble(JOptionPane.showInputDialog(
				"O valor de compras deste cliente ultrapassou 100 reais.\nDigite o desconto que ele ter� a partir de agora."));
		// Cliente especial recebe os dados do Cliente recebido por parâmetro e o desconto definido pelo usuario
		ClienteEspecial especial = new ClienteEspecial(c, desconto);

		// Substituicao de um Cliente para Cliente especial na Matriz
		for (int linha = 0; linha < matrizClientes.length; linha++) 
			for (int coluna = 0; coluna < matrizClientes[linha].length; coluna++) 
				if (matrizClientes[linha][coluna] == c)
					matrizClientes[linha][coluna] = especial;

		return especial;

	}

}
