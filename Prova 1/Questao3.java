import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARACAO E INSTANCIACAO DE VARIAVEIS

		int valor = 0, multiplicacao = 0, valorFinal = 0;

		// SOLICITACAO DE VALORES PARA O CALCULO

		valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor"));
		multiplicacao = Integer.parseInt(JOptionPane
				.showInputDialog("Insira o valor de multiplicação"));

		// CALCULO FEITO POR UM LAÇO 'FOR'

		for (int i = 0; i < multiplicacao; i++) {

			valorFinal = valorFinal + valor;
		}

		// CALCULO FEITO POR UM LAÇO 'WHILE'

		while (multiplicacao > 0) {

			valorFinal = valorFinal + valor;
			multiplicacao = multiplicacao - 1;
		}

		// CALCULO FEITO POR UM LAÇO 'DO WHILE'

		do {
			valorFinal = valorFinal + valor;
			multiplicacao = multiplicacao - 1;

		} while (multiplicacao > 0);

		JOptionPane.showMessageDialog(null, "Resultado:" + valorFinal);

	}

}
