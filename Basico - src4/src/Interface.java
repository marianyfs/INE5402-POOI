import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

//------- Solicitação e Converção de valores ---------------------------
	public double PegueAresta1() {								// 1.

		double aresta1 = 0.0;
		do {

			try {

				String vAresta1 = JOptionPane
						.showInputDialog("Digite o valor da Primeira Aresta");
				aresta1 = Double.parseDouble(vAresta1);
				break;

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Informe apenas números (ex: 0.0)");
			}
		} while (true);

		return aresta1;
	}
// ----------------------------------------------------------------------------------------------
	public double PegueAresta2() {								// 3.

		double aresta2 = 0.0;
		do {

			try {

				String vAresta2 = JOptionPane
						.showInputDialog("Digite o valor da Segunda Aresta");
				aresta2 = Double.parseDouble(vAresta2);
				break;

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Informe apenas números (ex: 0.0)");
			}
		} while (true);

		return aresta2;
	}
// ----------------------------------------------------------------------------------------------
	public double PegueAresta3() {								// 5.	

		double aresta3 = 0.0;
		do {

			try {

				String vAresta3 = JOptionPane
						.showInputDialog("Digite o valor da Terceira Aresta");
				aresta3 = Double.parseDouble(vAresta3);
				break;

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Informe apenas números (ex: 0.0)");
			}
		} while (true);

		return aresta3;
	}

//------- Mensagem que mostra os valores finais ao Usuário -------------
	public void MostreMensagem(double vAresta1, double vAresta2,
			double vAresta3, double vResultArea, double vResultVolume) {
																// 9.
				
/* Perceba que este método recebe algumas variaveis como parametro que 
 * em conjunto as classes Paralelepipedo e Principal terão seus valores
 * devidamente 'preenchidos' ao desenrrolar do Algorítimo. A declaração 
 * dos parâmetros nesse método é importante para que possamos ter a
 * Mensagem final desejada. A Ordem dos parâmetros implica diretamente,
 * por isso preste muita atenção. 
 * */

		JOptionPane.showMessageDialog(null,
				"Para o Paralelepipedo  de arestas: " + vAresta1 + " | "
						+ vAresta2 + " | " + vAresta3 + "\n A area Externa é "
						+ vResultArea + "\n O Volume é: " + vResultVolume);
	}

}
