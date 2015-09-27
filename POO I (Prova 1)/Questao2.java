import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARACAO E INSTANCIACAO DE VARIAVEIS

		double distanciaA = 0.0, distanciaAx = 0.0, distanciaAy = 0.0,

		distanciaB = 0.0, distanciaBx = 0.0, distanciaBy = 0.0,

		somaDistancias = 0.0, maiorDistancia = 0.0, distanciaPontos = 0.0;

		int quantidadePares = 0;

		// INICIO DO LACO FOR

		for (int i = 1; i != 0; i++) {

			// SOLICITACAO DE VALORES PARA O USUÁRIO

			distanciaAx = Double.parseDouble(JOptionPane
					.showInputDialog("Forneça a Distancia A (x)"));
			distanciaAy = Double.parseDouble(JOptionPane
					.showInputDialog("Forneça a Distancia A (y)"));
			distanciaBx = Double.parseDouble(JOptionPane
					.showInputDialog("Forneça a Distancia B (x)"));
			distanciaBy = Double.parseDouble(JOptionPane
					.showInputDialog("Forneça a Distancia B (y)"));

			distanciaA = distanciaAy - distanciaAx;
			distanciaB = distanciaBy - distanciaBx;

			// LETRA A

			distanciaPontos = (Math.sqrt(Math.pow(distanciaA, 2)
					+ Math.pow(distanciaB, 2)));

			JOptionPane.showMessageDialog(null, "Distancia entre os Pontos: "
					+ distanciaPontos);

			// LETRA B

			if (distanciaPontos < 10.0) {
				somaDistancias = somaDistancias + distanciaPontos;
			}

			// LETRA C

			if (distanciaPontos <= 10.0 && distanciaPontos <= 18.0) {

				quantidadePares = quantidadePares + 1;

			}

			// LETRA D
			if (maiorDistancia < distanciaPontos) {

				maiorDistancia = distanciaPontos;
			}

			// CONDICAO DE PARADA

			if (distanciaAx == 0 && distanciaAy == 0 && distanciaBx == 0
					&& distanciaBy == 0) {

				JOptionPane.showMessageDialog(null,
						"Os resultados Obtidos foram: B)" + somaDistancias
								+ "\n C)" + quantidadePares + "\n D)"
								+ maiorDistancia);

				break;

			}

		}

	}

}
