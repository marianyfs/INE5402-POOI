import javax.swing.JOptionPane;

public class Exercicio2 {

	/*
	 * Escreva um programa que determine a matriz resultante da soma de duas
	 * matrizes, ambas de ordem N por M.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// --Preenchimento da Ordem das Matrizes --------------------------------------------------
		
		int ordemLinha = 0, ordemColuna = 0;
		ordemLinha = Integer.parseInt(JOptionPane .showInputDialog("Informe o Numero de LINHAS das Matrizes a serem somadas"));
		ordemColuna = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de COLUNAS das Matrizes a serem somadas"));

//--Declaração das Matrizes ----------------------------------------------------------------
		
		int[][] matrizA = new int[ordemLinha][ordemColuna];
		int[][] matrizB = new int[ordemLinha][ordemColuna];
		int[][] matrizSoma = new int[ordemLinha][ordemColuna];

//--Preenchimento das Matrizes -------------------------------------------------------------

		for (int linha = 0; linha < matrizA.length; linha++) {

			for (int coluna = 0; coluna < matrizA[0].length; coluna++) {

				matrizA[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("MATRIZ A \n" + "Informe o valor a ser armazenado (Linha: [ " + (linha+1) + " ] " + " Coluna: [ " + (coluna+1) + " ])"));
			}
		}

		for (int linha = 0; linha < matrizB.length; linha++) {

			for (int coluna = 0; coluna < matrizB[0].length; coluna++) {

				matrizB[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("MATRIZ B \n" + "Informe o valor a ser armazenado (Linha: [ " + (linha+1) + " ] " + " Coluna: [ " + (coluna+1) + " ])"));

			}
		}
		
//--Calculo da soma das Matrizes --------------------------------------------------------------------

		String concatena = "";			

		for (int linha = 0; linha < matrizA.length; linha++) {

			for (int coluna = 0; coluna < matrizA[0].length; coluna++) {

				matrizSoma[linha][coluna] = (matrizA[linha][coluna] + matrizB[linha][coluna]);		// Preenche a Matriz Resultante com a soma de cada elemento das Matrizes A e B
				concatena += matrizSoma[linha][coluna] + " "; 										// concatena a Matriz da Soma nas linhas

			}
			concatena += "\n";																		// concatena pula a linha para a proxima coluna

		}
		JOptionPane.showMessageDialog(null, concatena);	
	}
}
