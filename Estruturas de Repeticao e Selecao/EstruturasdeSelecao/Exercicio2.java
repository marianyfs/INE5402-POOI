import javax.swing.JOptionPane;


public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* ------------------------------------ Exercícios-------------------------------------

		2. Elabore um programa que, para um número inteiro positivo N, determine se
		esse número é par ou não.
		
/* -----------------------------------------------------------------------------------*/
	
		int valor =0;
		
		String dValor = JOptionPane.showInputDialog("Informe um valor");
		valor = Integer.parseInt(dValor);
		
		if (valor % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "Este � um n�mero par");
		} else {
			JOptionPane.showMessageDialog(null, "Este n�mero � impar");
		}
	}

}
