import javax.swing.JOptionPane;

public class Exercicio4 {
	/*
	 * 
	 * Elabore um programa que leia um array X com N elementos reais e mostre as
	 * posições que o maior e o menor elemento ocupam no array
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] array = new double[10];

		int menor = 0, maior = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para [ " + (i) + " ]"));

			if (array[i] < array[menor]) {
				menor = i;
			}
			if (array[i] > array[maior]) {
				maior = i;
			}
		}

		JOptionPane.showMessageDialog(null, "Maior valor: " + array[maior] + " Posição: [ " + maior + " ]" +
										 "\n Menor valor: " + array[menor] + " Posição: [ " + menor + " ]");
	}

}
