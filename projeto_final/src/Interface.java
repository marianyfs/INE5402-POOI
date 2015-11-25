import javax.swing.JOptionPane;


public class Interface {

	//-----------------------------------------------------------------------------------------------------------------------------------
	
	public Interface () {
		super ();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	public String getString(String m){
		
		String value = null;
		
		do {
			value = JOptionPane.showInputDialog(m);
			
			if (value == null){
				JOptionPane.showMessageDialog(null, "Nao foi possivel armazenar o texto digitado, por favor insira-o novamente");
			}
			
		} while (value == null);
		return value;
	}

	//-----------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	public int getInteger(String m) {
		
		int integer = 0;
		
		do {
			try {
				String value = JOptionPane.showInputDialog(m);
				integer = Integer.parseInt(value);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros Inteiros entre -2.147.483.648 e 2.147.483.647");
			}
			
		} while (true);

		return integer;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	public int getIntegerNatural(String m) {
		
		int integer = 0;
		boolean exception = false;
		
		do {
			try {
				String value = JOptionPane.showInputDialog(m);
				integer = Integer.parseInt(value);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros entre 0 e 2.147.483.647");
				exception = true;
			}
			
			if (integer < 0 || integer > 2147483647) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros entre 0 e 2.147.483.647");
				exception = true;
			}
			
		} while (exception = true);

		return integer;
	}

	//-----------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------

	public double getDouble(String m) {
		
		double aDouble = 0;
		
		do {
			try {
				String value = JOptionPane.showInputDialog(m);
				aDouble = Double.parseDouble(value);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros Decimais entre -2.000.000.000,00 e 2.000.000.000,00");
			}
			
		} while (true);

		return aDouble;
	}

	//-----------------------------------------------------------------------------------------------------------------------------------	

	public double getDoubleNatural(String m) {
		
		
		double aDouble = 0;
		boolean exception = false;
		
		do {
			try {
				String value = JOptionPane.showInputDialog(m);
				aDouble = Double.parseDouble(value);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros Decimais entre 0,00 e 2.000.000.000,00");
				exception = true;
			}
			
			if (aDouble < 0 || aDouble > 2000000000) {
				JOptionPane.showMessageDialog(null, "Informe apenas numeros Decimais entre 0,00 e 2.000.000.000,00");
				exception = true;
			}
			
		} while(exception = true);

		return aDouble;
	}

	//-----------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	public void showMessage(String m) {
		
		JOptionPane.showMessageDialog(null, m);
	}
	

}