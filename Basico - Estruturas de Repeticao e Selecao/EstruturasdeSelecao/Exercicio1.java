import javax.swing.JOptionPane;


public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* ------------------------------------ Exercícios-------------------------------------

	1. Elabore um programa que, dada a idade de uma pessoa, informe se esta é criança,
	adolescente ou adulto. Considere as faixas etárias conforme a seguir:
	
		A.Idade até 12 anos: Criança
		B. Idade maior que 12 e menor que 18 anos: Adolescente
		C.Idade maior ou igual a 18 anos: Adulto  
		
/* -----------------------------------------------------------------------------------*/
		
		int idade = 0;
		
		String vIdade = JOptionPane.showInputDialog("Informe a idade");
		idade = Integer.parseInt(vIdade);
		
		if (idade <= 12) {
			
			JOptionPane.showMessageDialog(null, "Criança");
			
		} else if (idade > 12 && idade < 18) {
			
			JOptionPane.showMessageDialog(null, "Adolecente");
		} else {
		
		JOptionPane.showMessageDialog(null, "Adulto");
		}
	

}
}