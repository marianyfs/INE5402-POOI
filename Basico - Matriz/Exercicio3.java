import javax.swing.JOptionPane;

public class Exercicio3 {

	/*
	 * Para uma matriz de ordem NxN, determinar:
	 * a) Soma dos elementos da diagonal principal;
	 * b) Produto dos elementos da diagonal secundária
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// --Preenchimento da Ordem da Matriz --------------------------------------------------

		int ordem = 0;
		ordem = Integer.parseInt(JOptionPane.showInputDialog("Informe a Ordem da Matriz (N x N)"));

// --Declaração das Matrizes ----------------------------------------------------------------

		int[][] matriz = new int[ordem][ordem];
		int soma = 0, multiplicacao = 1;
		
		
// --Preenchimento da Matrize -------------------------------------------------------------

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[0].length; coluna++) {

				matriz[linha][coluna] =Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser armazenado (Linha: [ " + (linha+1) + " ] " + " Coluna: [ " + (coluna+1) + " ])"));
				
		// Calculo da Soma da Principal e da Multiplicação da Secundária
					
				if (linha == coluna) soma += matriz[linha][coluna];
				
				if ((linha + coluna) == (ordem - 1)) multiplicacao = multiplicacao * matriz[linha][coluna];
						
			}
	
		}

		JOptionPane.showMessageDialog(null, "O resultado da Soma da Diagonal Princial é: " + soma + "\n" +
											"O resultado da Multiplicação da Diagonal Secundária é: " + multiplicacao);

	}

}
