import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARACAO E INSTANCIACAO DE VARIAVEIS

		int soma = 0, multiplicacao = 0, valorX = 0, valorY = 0, numeroSuportado = 0;

		// DECLARACAO DO MAIOR VALOR SUPORTADO PELO COMPUTADOR

		numeroSuportado = 1023;

		// SOLICITACAO DOS VALORES PARA O CALCULO

		valorX = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o valor de x"));

		valorY = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o valor de y"));

		// CALCULOS EFETUADOS

		soma = valorX + valorY;
		multiplicacao = valorX * valorY;

		// VERIFICACAO DO RESULTADO DAS OPERACOES FEITAS

		if (soma > numeroSuportado || multiplicacao > numeroSuportado) {

			JOptionPane.showMessageDialog(null, "OVERFLOW");
		} else
			JOptionPane.showMessageDialog(null, "OK");
	}

}
