import javax.swing.JOptionPane;


public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* ------------------------------------ Exercícios-------------------------------------

		7. Uma empresa de vendas tem três corretores. A empresa paga ao
		corretor uma comissão calculada de acordo como o valor de suas
		vendas. Se o valor total da venda de um corretor for maior que
		R$50000,OO, a comissão será de 12% do valor vendido. Se o
		valor da venda do corretor estiver entre R$30000,00 e R$50000,00
		(incluindo extremos), a comissão será de 9,5%. Em qualquer outro
		caso a comissão será de 7%. Escreva um programa que gere um
		relatório contendo nome, valor da venda e comissão de cada um
		dos corretores. O relatório deve mostrar também o total de vendas
		da empresa.
		
/* -----------------------------------------------------------------------------------*/
		
	
		String corretor1,
			   corretor2,
			   corretor3;
		
		double vendaCorretor1 = 0.0, comissaoCorretor1,
			   vendaCorretor2 = 0.0, comissaoCorretor2,
			   vendaCorretor3 = 0.0, comissaoCorretor3,
			   vendaEmpresa;
		
		
		corretor1 = JOptionPane.showInputDialog("Informe o Nome do Corretor (1)");
		String vendaCorr1 = JOptionPane.showInputDialog("Informe as o Valor das Vendas (1)");
		vendaCorretor1 = Double.parseDouble(vendaCorr1);
		
		if ( vendaCorretor1 > 50000.00) {
			
			comissaoCorretor1 = ((vendaCorretor1 * 12) / 100);
		
		} else if ( vendaCorretor1 > 30000.00 && vendaCorretor1 < 50000.00) {
		
			comissaoCorretor1 = ((vendaCorretor1 * 9.5) / 100);
			
		} else {
	
			comissaoCorretor1 = ((vendaCorretor1 * 7) / 100);
			
		}
		

		corretor2 = JOptionPane.showInputDialog("Informe o Nome do Corretor (2)");
		String vendaCorr2 = JOptionPane.showInputDialog("Informe as o Valor das Vendas (2)");
		vendaCorretor2 = Double.parseDouble(vendaCorr2);
		
		if ( vendaCorretor2 > 50000.00) {
			
			comissaoCorretor2 = ((vendaCorretor2 * 12) / 100);
		
		} else if ( vendaCorretor2 > 30000.00 && vendaCorretor2 < 50000.00) {
		
			comissaoCorretor2 = ((vendaCorretor2 * 9.5) / 100);
			
		} else {
	
			comissaoCorretor2 = ((vendaCorretor2 * 7) / 100);
			
		}

		
		corretor3 = JOptionPane.showInputDialog("Informe o Nome do Corretor (3)");
		String vendaCorr3 = JOptionPane.showInputDialog("Informe as o Valor das Vendas (3)");
		vendaCorretor3 = Double.parseDouble(vendaCorr3);
		
		if ( vendaCorretor3 > 50000.00) {
			
			comissaoCorretor3 = ((vendaCorretor3 * 12) / 100);
		
		} else if ( vendaCorretor3 > 30000.00 && vendaCorretor3 < 50000.00) {
		
			comissaoCorretor3 = ((vendaCorretor3 * 9.5) / 100);
			
		} else {
	
			comissaoCorretor3 = ((vendaCorretor3 * 7) / 100);
			
		}
		
		vendaEmpresa = vendaCorretor1 + vendaCorretor2 + vendaCorretor3;
		
		JOptionPane.showMessageDialog(null, " -------------------------------- RELAT�RIO -------------------------------- " +
										  "\n" +
										  "\n Corrretor	_____|_____ Vendas	_____|_____ Comiss�o" + 
										  "\n " + corretor1 +" | " + vendaCorretor1 + " _____|_____ " + comissaoCorretor1 + 
										  "\n " + corretor2 + " | "+ vendaCorretor2 + " _____|_____ " + comissaoCorretor2 +
										  "\n " + corretor3 + "	| "+ vendaCorretor3 +  " _____|_____ "+ comissaoCorretor3 +
										  "\n	_____________________________________________________________________ " +
										  "\n Vendas totais da empresa: " + vendaEmpresa);
		
	}

}
