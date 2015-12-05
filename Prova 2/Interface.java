import javax.swing.JOptionPane;


public class Interface {
	
	public Interface (){
		super();
	}
	
	public int getInteger (String m){
		
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	public float getFloat (String m){
		
		return Float.parseFloat(JOptionPane.showInputDialog(m));
	}
	
	public String getString (String m){
		return JOptionPane.showInputDialog(m);
	}
	
	public void showMenssage (String m){
		JOptionPane.showMessageDialog(null, m);
	}

}
