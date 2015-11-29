import javax.swing.JOptionPane;


public class Interface {
	
	public Interface () {
		super ();
	}
	
	
	public int pegueValor (String m) {
		
	/*Metodo que recebe uma mensagem (Input) por parâmetro (Veja na classe controle)
	 * E passa no retorno do método o (Input) convertido para Integer (int)*/

		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}


	public void mostreResultado (String m) {
	
		// Metodo para mostrar uma mensagem genérica ao Usuário 
		
		JOptionPane.showMessageDialog(null,m);
	}
}
