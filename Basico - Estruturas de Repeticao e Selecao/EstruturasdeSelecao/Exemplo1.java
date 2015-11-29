import javax.swing.JOptionPane;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* ------------------------------------ Exercícios-------------------------------------

		1. EXEMPLO: dado dois valores, informe o maior entre eles
		
/* -----------------------------------------------------------------------------------*/
		
		
		int valorA, valorB;
		
		valorA = 0;
		valorB = 0;
		
		String receptorA = JOptionPane.showInputDialog("Informe o primeiro valor");
		valorA = Integer.parseInt(receptorA);
		
		String receptorB = JOptionPane.showInputDialog("Informe o segundo valor");
		valorB = Integer.parseInt(receptorB);


/* --------------------------------- COMANDOS DE SELEÇÃO ----------------------------
 * ----------------------------------------------------------------------------------
 * 		    Se (expressão lógica) Então 
 * 		 	
 * 				Comando 1
 * 				Comando 2
 *				 ...
 * 				Comando N
 * 
 * 			Fim
 * ----------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------- */
		
		if (valorA > valorB) {
			
			JOptionPane.showMessageDialog(null, "O Primeiro valor ( " + valorA + " ) � maior");
		} else if (valorB > valorA) {
			JOptionPane.showMessageDialog(null, "O Segundo valor ( " + valorB + " ) � maior");
			
		} else {
			JOptionPane.showMessageDialog(null, "Os valores s�o iguais");
		}
	}

}
