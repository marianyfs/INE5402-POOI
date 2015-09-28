import javax.swing.JOptionPane;

public class Exercicio5 {
/*

Escreva um programa que leia um arranjo X de N
elementos e um valor qualquer K. Após, determine e
imprima o array resultante da multiplicação de K por X.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] array = new double[5];			// array

		int k = 0;					// Constante para a multiplicação
		String arrayValores = " ";			// variavel para concatenar os valores do array

		// preenchimento do array
		for (int i = 0; i < array.length; i++) {

			array[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para [ " + (i) + " ]"));

		}
		// Solicitação da Constante para a multiplicação
		k = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Multiplicação"));
		
		for (int i = 0; i < array.length; i++) {
			// multiplicação de todos os elementos pela constante K e concatenação do resultado na String
			array[i] = array[i] * k;
			arrayValores += "Posição: " + i + "   Valor: " + array[i] + "\n";
		}

		// resultado
		JOptionPane.showMessageDialog(null, arrayValores);
		
	}

}
