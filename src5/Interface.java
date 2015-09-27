import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

	public String PegueNome() {

		String nome = JOptionPane
				.showInputDialog("Informe o nome do Funcionário");
		return nome;
	}

	public double PegueSalarioBruto() {

		double salBruto = 0.0;

		do {
			try {
				String vSalBruto = JOptionPane
						.showInputDialog("Informe o Salário Bruto do Funcionário");
				salBruto = Double.parseDouble(vSalBruto);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Informe apenas números (0.0)");
			}
		} while (true);

		return salBruto;
	}

	public void MostreMensagem(String vNome, double vSalBruto,
			double vSalLiquido) {

		JOptionPane.showMessageDialog(null, "O Funcinário" + vNome
				+ " possui: \n" + "Salário Bruto: " + vSalBruto
				+ "\n Salário Liquido: " + vSalLiquido);
	}

}
