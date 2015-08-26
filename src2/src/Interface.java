import javax.swing.JOptionPane;

public class Interface {
	
	// Classe de Interação com o usuário

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

	/*Metodo que informa o valor calculado para o usuário e recebe
	* uma variavel double como parametro que em conjunto com a
	* classe Principal e Esfera recebe o resultado final do Volume.
	*/
	public void mostreVolume(double vVolume) {
		
		JOptionPane.showMessageDialog(null, "O Valor do Volume da Esfera é: "+ vVolume);
	}

}
