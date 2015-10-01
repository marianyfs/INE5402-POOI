import javax.swing.JOptionPane;

public class Exercicio1 {
	/*
	 * Construa um programa que, para uma matriz 20x10, calcule a soma dos
	 * elementos de cada uma das linhas e escreva as somas obtidas. O programa
	 * deve mostrar também o número da linha que apresentou a maior soma
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//--Declaração das Matrizes ----------------------------------------------------------------

		int[][] matriz = new int[20][10];

		int somaDaLinha = 0, maiorSoma = 0, linhaMaiorSoma = 0, somaResultados = 0;
		String resultados = "";

// --Preenchimento da Matrize -------------------------------------------------------------

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[0].length; coluna++) {

				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser armazenado (Linha: [ " + (linha+1) + " ] " + " Coluna: [ " + (coluna+1) + " ])"));
// -- Calculo da soma de linha da Matriz
				
				somaDaLinha += matriz[linha][coluna];
// -- Comparação da soma de cada linha a procura da maior soma
				if (maiorSoma < somaDaLinha) {
					maiorSoma = somaDaLinha;			// Guarda a maior soma
					linhaMaiorSoma = (linha + 1);		// Guarda a linha onde está a maior soma
				}
			}
			somaResultados += somaDaLinha;				// Soma todos os resultados das linhas
			resultados += somaDaLinha + "; ";			// Concatena todos os resultados de cada soma das linhas
		}

		JOptionPane.showMessageDialog(null, "Os resultados Obtidos foram: " + resultados + " Totalizando: " + somaResultados + "\n"
				+ "A Maior soma encontrada foi: " + maiorSoma + " na linha: " + linhaMaiorSoma);

	}

}
