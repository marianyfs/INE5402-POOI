import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* ------------------------------------ Exercícios-------------------------------------

		2. EXEMPLO
		
/* -----------------------------------------------------------------------------------*/
	
		int A, B, Z;
		double X, H;

		A = 2;
		B = 4;
		Z = 0;
		X = 5.0;
		H = 0.0;

		if (A != B) {

			Z = B + A;
			B = B * A;
			H = X / A;

		}
		
		if (Z >= B) {

			H = 1.0;

		} else {
			H = 0;
		}

		JOptionPane.showMessageDialog(null, "A =  " + A + "\n B = " + B
				+ "\n Z = " + Z + "\n X = " + X + "\n H = " + H);
	}

}
