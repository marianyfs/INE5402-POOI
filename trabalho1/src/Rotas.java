public class Rotas {

	private int matrizRotas[][];

	// ----------------- CONSTRUTOR --------------------------------------

	public Rotas(int[][] matriz) {

		this.matrizRotas = matriz;
	}

	// ----------------- GETS E SETS --------------------------------------

	public int[][] getMatrizRotas() {
		return matrizRotas;
	}

	public void setMatrizRotas(int[][] matrizRotas) {
		this.matrizRotas = matrizRotas;
	}

	// ----------------- QUESTAO 1 -----------------------------------------
	public int saidasCidadeK(int k) {
		// Inteiro que guardará o número de saidas da cidade pesquisada
		int saidasCidadeK = 0;

		for (int coluna = 0; coluna < matrizRotas.length; coluna++) {
			// Saidas recebe 1 caminho, caso na linha 'K', definida pelo usuário
			// houver 1 em alguma coluna.
			saidasCidadeK += matrizRotas[k][coluna];
		}
		// O retorno decrementa 1 pois a Matriz de caminhos é reflexiva.
		return (saidasCidadeK - 1);
	}

	// -----------------
	public int chegadasCidadeK(int k) {
		// Inteiro que guardará o número de chegadas da cidade pesquisada
		int chegadasCidadeK = 0;

		for (int linha = 0; linha < matrizRotas.length; linha++) {
			// Chegadas recebe 1 caminho, caso na linha existir 1, existir
			// alguma coluna, definida pelo usuário houver.
			chegadasCidadeK += matrizRotas[linha][k];
		}
		// O retorno decrementa 1 pois a Matriz de caminhos é reflexiva.
		return (chegadasCidadeK - 1);
	}

	// ----------------- QUESTAO 2
	// -------------------------------------------------

	public int maiorNumeroChegadas() {
		// Inteiro que guardará o maior número de chegadas da cidade pesquisada;
		// a cidade correspondente e as chegadas existentes para determinada
		// cidade
		int maiorNumeroChegadas = 0, chegadas;
		int cidade = -1;
		for (int i = 0; i < matrizRotas.length; i++) {
			// ultilização do método de calculo de chegadas de uma cidade (int
			// k)
			chegadas = chegadasCidadeK(i);
			// se o numero armazenado for menor do que a chegada para a cidade
			// i, então ele é atualizado
			if (maiorNumeroChegadas < chegadas) {
				maiorNumeroChegadas = chegadas;
				// armazenamento do indice da cidade com maior numero de
				// chegadas
				cidade = i;
				
		}
		}
		// retorno do método
		return cidade;
	}

	// ----------------- QUESTAO 3
	// -------------------------------------------------

	public boolean ligacoesDiretas(int k) {

		for (int indice = 0; indice < matrizRotas.length; indice++) {
			// k, defimido pelo usuário é testado para saber se existe chegada e
			// saida diferentes, caso houver retorna falso

			if (indice != k) { // se o indice for diferente de K os valores são
								// testados

				if (matrizRotas[indice][k] != matrizRotas[k][indice]) {

					return false;
				}
			}
		}
		return true;
	}

	// ----------------- QUESTAO 4
	// -------------------------------------------------

	public String saidasDiretasK(int k) {
		// string para concatenar o indice da matriz (cidade) correspondente
		String saidas = "";

		for (int linha = 0; linha < matrizRotas.length; linha++) {
			// verificação de todas as saidas para a cidade pesquisada
			if (matrizRotas[linha][k] == 1 && linha != k)
				saidas += linha + " ";
		}
		return saidas;
	}

	// ----------------- QUESTAO 5
	// -------------------------------------------------

	public String cidadeIsolada() {
		// string para concatenar o indice da matriz (cidade) correspondente
		String cidadesIsoladas = "";

		for (int k = 0; k < matrizRotas.length; k++)
			// ultilização dos metodos de calculo de saida e de chegadas de uma
			// cidade pesquisada
			if (saidasCidadeK(k) == 0 && chegadasCidadeK(k) == 0) {

				cidadesIsoladas += k + " ";
			}

		return cidadesIsoladas;
	}
	// -----------------

	public String cidadesSemChegada() {
		// string para concatenar o indice da matriz (cidade) correspondente
		String cidadesSemChegadas = "";

		for (int k = 0; k < matrizRotas.length; k++)
			// ultilização dos metodos de calculo de saida e de chegadas de uma
			// cidade pesquisada
			if (saidasCidadeK(k) >= 1 && chegadasCidadeK(k) == 0) {

				cidadesSemChegadas += k + " ";
			}

		return cidadesSemChegadas;
	}

	// -----------------

	public String cidadesSemSaida() {
		// string para concatenar o indice da matriz (cidade) correspondente
		String cidadesSemSaida = "";

		for (int k = 0; k < matrizRotas.length; k++)
			// ultilização dos metodos de calculo de saida e de chegadas de uma
			// cidade pesquisada
			if (saidasCidadeK(k) == 0 && chegadasCidadeK(k) >= 1) {

				cidadesSemSaida += k + " ";
			}

		return cidadesSemSaida;
	}

}
