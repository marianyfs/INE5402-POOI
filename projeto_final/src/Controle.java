import java.util.Arrays;

import javax.swing.JOptionPane;

public class Controle {
	static Matriz matrizClientes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface aInterface = new Interface();

		// ------Preenchimento de uma lista de produtos para que o Cliente tenha
		// opcaes de compra
		Produto arrayProdutos[] = new Produto[6];

		Produto objProduto0 = new Produto(0, "Cafe", "Mellita", "Atacado", 70.00);
		Produto objProduto1 = new Produto(1, "Acucar", "Uniao", "Unidade (5kg)", 10.00);
		Produto objProduto2 = new Produto(2, "Chocolate", "Garoto", "Atacado", 30.00);
		Produto objProduto3 = new Produto(3, "Achocolatado", "Nescau", "Atacado", 50.00);
		Produto objProduto4 = new Produto(4, "Leite de caixinha", "Piracanjuba", "Atacado", 30.00);
		Produto objProduto5 = new Produto(5, "Creme de avela", "Nutella", "Atacado", 40.00);

		arrayProdutos[0] = objProduto0;
		arrayProdutos[1] = objProduto1;
		arrayProdutos[2] = objProduto2;
		arrayProdutos[3] = objProduto3;
		arrayProdutos[4] = objProduto4;
		arrayProdutos[5] = objProduto5;

		// ----- Definicoes e instancias de uso geral no Controle sobre a Matriz
		// de Clientes ---------

		int ordem = aInterface.getIntegerNatural("Digite a ordem da matriz");

		matrizClientes = new Matriz(ordem);

		// ------Inicio da interacao com o
		// usuario----------------------------------------------------
		int opcoesMenu = 0;
		do {

			opcoesMenu = aInterface.getIntegerNatural(
												"BEM VINDO AO GERENCIADOR DE CLIENTES E COMPRAS\n\n"
					+ "Opcao 1: Cadastrar um novo Cliente\n"
					+ "Opcao 2: Incluir uma nova compra para um determinado Cliente (tenha em maos o ID do Cliente/Produto)\n\n"

					+ "Opcao 3: Informar a quantidade de clientes que compraram um determinado produto.\n"
					+ "Opcao 4: Pesquisar a existencia de um determinado produto e retornar o nome do cliente que contem este produto.\n"
					+ "Opcao 5: Pesquisar a inexistancia de um determinado produto retornando verdadeiro (inexiste nos arrays) ou falso (existe em algum array).\n"
					+ "Opcao 6: Informar a quantidade total de clientes inseridos na matriz. Informar a quantidade de Clientes Especiais na matriz.\n"
					+ "Opcao 7: Ordenar a matriz em ordem crescente, considerando os nomes dos clientes.\n\n"

					+ "Opcao 8: Visualizar os Clientes Cadastrados na Matriz\n"
					+ "Opcao 9: Visualizar os Produtos Dispoiveis\n"
					+ "Opcao 10: Visualizar as informacoes de um determinado Cliente (tenha em maos o ID do Cliente) \n" 

					+ "Opcao 11: Sair");

			if (opcoesMenu == 1) {
				// Cadastro do Cliente
				Cliente c = matrizClientes.inserirClientes();
				aInterface.showMessage(c.toString());
			}

			if (opcoesMenu == 2) {
				// Cadastro de relacoes entre Cliente e Produto
				int idCliente = aInterface.getIntegerNatural("Informe o ID do Cliente");
				Cliente c = matrizClientes.buscaCliente(idCliente);

				if (c != null) {

					int idProduto = aInterface
							.getIntegerNatural("Informe o ID do Produto\n" + Arrays.toString(arrayProdutos));

					if (idProduto < arrayProdutos.length) {
						double valorCompra = c.inserirProduto(arrayProdutos[idProduto]);
						aInterface.showMessage("O valor total das compras de " + c.getNome() + " e: " + valorCompra);

					} else
						aInterface.showMessage("O Produto nao existe, verifique e tente novamente");
				} else
					aInterface.showMessage("O Cliente nao existe na Matriz, verifique e tente novamente");

			}
			if (opcoesMenu == 3) {
				// Questao 1 
				int idProduto = aInterface
						.getIntegerNatural("Informe o ID do Produto\n" + Arrays.toString(arrayProdutos));
				if (idProduto < arrayProdutos.length) {
					int num = matrizClientes.numClientesCompraram(idProduto);
					aInterface.showMessage("A quantidade de clientes que compraram o produto "
							+ arrayProdutos[idProduto].getNome() + " e: " + num);
				} else
					aInterface.showMessage("O Produto nao existe, verifique e tente novamente");
			}
			if (opcoesMenu == 4) {
				// Questao 2
				int idProduto = aInterface
						.getIntegerNatural("Informe o ID do Produto\n" + Arrays.toString(arrayProdutos));
				if (idProduto < arrayProdutos.length) {
					String nomes = matrizClientes.nomeClienteComprou(idProduto);
					aInterface.showMessage(
							"Os Clientes [ " + nomes + "] compraram o produto: " + arrayProdutos[idProduto].getNome());
				} else
					aInterface.showMessage("O Produto nao existe, verifique e tente novamente");
			}
			if (opcoesMenu == 5) {
				// Questao 3
				int idProduto = aInterface
						.getIntegerNatural("Informe o ID do Produto\n" + Arrays.toString(arrayProdutos));
				if (idProduto < arrayProdutos.length) {
					boolean a = matrizClientes.produtoFoiComprado(idProduto);
					aInterface.showMessage("O produto" + arrayProdutos[idProduto].getNome()
							+ (a ? " nao existe em algum array." : " existe em algum array."));
				} else
					aInterface.showMessage("O Produto nao existe, verifique e tente novamente");
			}
			if (opcoesMenu == 6) {
				// Questao 4
				JOptionPane.showMessageDialog(null, String.format("Clientes normais: %d\nClientes especiais: %d",
						Cliente.numClientes, Cliente.numEspeciais));
			}
			if (opcoesMenu == 7) {
				//Questao 5
				matrizClientes.ordenaMatriz();
				aInterface.showMessage(matrizClientes.toString());
			}
			if (opcoesMenu == 8) {
				// Imprime da Matriz de Clientes 
				JOptionPane.showMessageDialog(null, matrizClientes);
			}
			if (opcoesMenu == 9) {
				// Imprime  das informacoes dos Produtos
				JOptionPane.showMessageDialog(null, arrayProdutos);
			}
			if (opcoesMenu == 10) {
				// Imprime das informacoes de um determinado Cliente
				int idCliente = aInterface.getIntegerNatural("Insira o ID do Cliente");
				Cliente c = matrizClientes.buscaCliente(idCliente);
				JOptionPane.showMessageDialog(null, (c != null ? c.toString() : "none"));
			}

		} while (opcoesMenu > 0 && opcoesMenu < 11);

	}

}
