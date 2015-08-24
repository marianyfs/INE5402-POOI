import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

//------- Solicitação e Conversão dos Valores --------------------------
	public double pegueValorRaio() {

		double raio;

		do {
			try {
				// Solicitação do Raio
				String valorRaio = JOptionPane.showInputDialog("Forneça o valor do Raio");
				raio = Double.parseDouble(valorRaio);
				break;

			} catch (NumberFormatException e) {
				// Tratamento da Exceção
				JOptionPane.showMessageDialog(null,"Informe apenas números (0.0)");
			}
		} while (true);

		return raio;
	}

//--------------------- Mensagem que mostra o Volume para o usuário ----
	public void mostreVolume(double vVolume) {
		
		/*Metodo que informa o valor calculado para o usuário e recebe
		 * uma variavel double como parametro que em conjunto com a
		 * classe Principal e Esfera recebe o resultado final do Volume.
		*/
		JOptionPane.showMessageDialog(null, "O Valor do Volume da Esfera é: "+ vVolume);
	}

}
