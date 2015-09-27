import javax.swing.JOptionPane;


public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/* ------------------------------------ Exercícios-------------------------------------

		6. Um vendedor tem seu salário calculado em função do valor total de
	suas vendas. Esse cálculo é feito de acordo com o seguinte
	critério: se o valor total de suas vendas for maior que R$20000,00,
	o vendedor receberá como salário 10% do valor das vendas. Caso
	contrário, receberá apenas 7,5% do valor das vendas. Escrever um
	programa que determine o valor ganho pelo vendedor.
		
/* -----------------------------------------------------------------------------------*/
		
	
		double salario = 0.0, venda = 0.0;

		
		String vVenda = JOptionPane.showInputDialog("Informe o valor das vendas");
		venda = Double.parseDouble(vVenda);
		
		if (venda > 20000.00) {
			
			salario = ((venda * 10) / 100);
		
		} else {
			
			salario = ((venda * 7.5) / 100);
		}
	
		JOptionPane.showMessageDialog(null, "Sal�rio: " + salario);
	}

}
