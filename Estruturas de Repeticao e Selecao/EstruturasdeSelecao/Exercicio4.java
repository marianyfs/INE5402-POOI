import javax.swing.JOptionPane;


public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/* ------------------------------------ Exercícios-------------------------------------

		4. Escreva um programa que, para um determinado valor, informe se este é
		positivo, negativo ou zero.
		
/* -----------------------------------------------------------------------------------*/
		int valor =0;
		
		String vValor = JOptionPane.showInputDialog("Informe o valor");
		valor = Integer.parseInt(vValor);
		
		if (valor > 0) {
			
			JOptionPane.showMessageDialog(null, " Valor Positivo");
		}  else if (valor < 0) {
			
			JOptionPane.showMessageDialog(null, "Valor Negativo");
		} else {
			
			JOptionPane.showMessageDialog(null, "Valor igual a zero");
		}
	}

}
