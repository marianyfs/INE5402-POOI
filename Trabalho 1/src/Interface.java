import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

	// Metodo que fornece uma String para ultilização
	public String getString(String m) {

		return JOptionPane.showInputDialog(m);
	}

	// Metodo que fornece um Inteiro para ultilização
	public int getInteger(String m) {

		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}

	// Metodo que fornece um Decimal para ultilização
	public double getDouble(String m) {

		return Double.parseDouble(JOptionPane.showInputDialog(m));
	}

	// Metodo usado para informar o usuário de algo (nesse probrama para mostrar
	// os resultados)
	public void showMessage(String m) {

		JOptionPane.showMessageDialog(null, m);
	}

}