import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

//------- Solicitação e Converção de valores ---------------------------
	public String PegueNome() {									// 1.

		String nome;
		nome = JOptionPane.showInputDialog("Digite o Nome");
		return nome;
	}
// ---------------------------------------------------------------------
	public int PegueIdade() {									// 3.

		int idade = 0;
		do {

			try {
				String vIdade = JOptionPane.showInputDialog("Informe a Idade");
				idade = Integer.parseInt(vIdade);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros");
			}
		} while (true);

		return idade;
	}
// ---------------------------------------------------------------------
	public double PegueAltura() {								// 5.

		double altura;

		do {
			try {
				String vAltura = JOptionPane.showInputDialog("Informe Altura");
				altura = Double.parseDouble(vAltura);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros");
			}
		} while (true);

		return altura;
	}
	
//------- Mensagem que mostra os valores finais ao Usuário -------------
	public void MostrePesoIdeal(String vNome, int vIdade, double vAltura,
			double vPesoIdeal) {								// 8.

		JOptionPane.showMessageDialog(null, "O Peso Ideal para " + vNome
				+ " com " + vIdade + " anos e " + vAltura + " m é: "
				+ vPesoIdeal);
	}

}
