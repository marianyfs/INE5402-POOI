import javax.swing.JOptionPane;


public class Exercicio1_Interface {
	
	public Exercicio1_Interface () {
		super ();
	}
	
	public String pedePalavra(String m){
		
		return JOptionPane.showInputDialog(m);
	}
	
	public int pedeInteiro(String m) {
		
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}

	public double pedeDecimal(String m) {
		
		return Double.parseDouble(JOptionPane.showInputDialog(m));
	}
	
	public void mostraMensagem(String m) {
		
		JOptionPane.showMessageDialog(null, m);
	}
	

}
