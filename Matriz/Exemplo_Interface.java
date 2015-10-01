import javax.swing.JOptionPane;


public class Exemplo_Interface {
	
	public Exemplo_Interface () {
		super ();
	}
	
	public String getString(String m){
		
		return JOptionPane.showInputDialog(m);
	}
	
	public int getInteger(String m) {
		
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	

	public double getDouble(String m) {
		
		return Double.parseDouble(JOptionPane.showInputDialog(m));
	}
	
	public void showMessage(String m) {
		
		JOptionPane.showMessageDialog(null, m);
	}
	

}