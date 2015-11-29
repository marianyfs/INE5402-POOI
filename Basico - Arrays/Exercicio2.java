import javax.swing.JOptionPane;

public class Exercicio2 {

	/*
	 * Faça um programa que leia uma série de números inteiros e os armazene em
	 * um array. Em seguida, o programa deve determinar se nessa série de
	 * valores aparece algum valor repetido.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];

		// recebe os valores do array
		for (int i = 0; i < array.length; i++) {

			array[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o número para a posição: [ " + (i + 1) + " ]"));

		}

		int unique = 0, repeated = 0;

		for (int i = 0; i < array.length; ++i) {
			// controle
			boolean repeats = false;

			// procura se o número atual já existe antes dele mesmo
			// outra maneira de construir o for para que a comparação não seja feita 2 vezes é:
			// for (int j = i+1; j < array.length; ++i)
			for (int j = 0; j < i; ++j) {
				if (array[i] == array[j]) {
					repeats = true;
					break;
				}
			}

			// se repete, aumenta contador de repetições, se não, coloca no
			// unique
			if (repeats) {
				++repeated;
			} else {
				++unique;
			}
		}

		JOptionPane.showMessageDialog(null, "Há " + unique + " valores únicos no array.");
		JOptionPane.showMessageDialog(null, "Houve " + repeated + " repetições no array.");
	}

}
