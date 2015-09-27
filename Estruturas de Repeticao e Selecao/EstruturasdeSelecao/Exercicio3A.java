import javax.swing.JOptionPane;


public class Exercicio3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* ------------------------------------ Exercícios-------------------------------------

		3. Escreva o comando de seleção para cada uma das situações a seguir:

			A. Se X for maior que Y ou se Z for menor ou igual a 30, multiplique
			X por 2. Caso contrário, divida X por 2 e divida Z por 5;
			
/* -----------------------------------------------------------------------------------*/
		
	

		int X=0, Y=0, Z=0;
		
		String dX = JOptionPane.showInputDialog("Informe o valor de X");
		X = Integer.parseInt(dX);
		
		String dY = JOptionPane.showInputDialog("Informe o valor de Y");
		Y = Integer.parseInt(dY);
		
		String dZ = JOptionPane.showInputDialog("Informe o valor de Z");
		Z = Integer.parseInt(dZ);
	
		if ( X > Y || Z <= 30) {
			
			X = X * 2;
		} else {
			X = X /2;
			Z = Z / 5;
		}
	
	}

}
