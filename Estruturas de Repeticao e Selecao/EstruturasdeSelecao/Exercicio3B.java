import javax.swing.JOptionPane;


public class Exercicio3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* ------------------------------------ Exercícios-------------------------------------

		3. Escreva o comando de seleção para cada uma das situações a seguir:
			
			B. Se o desconto for menor que 25% e o preço do produto for maior que
			R$25000,00, então mostre o nome do produto.
		
/* -----------------------------------------------------------------------------------*/
		
	
		double desconto = 0.0, pProduto = 0.0;
		
		String nome = JOptionPane.showInputDialog("Informe o nome do produto");
		
		String vDesconto = JOptionPane.showInputDialog("Informe o desconto (%)");
		desconto = Double.parseDouble(vDesconto);
		
		String vProduto = JOptionPane.showInputDialog("Informe o Pre�o do Produto");
		pProduto = Double.parseDouble(vProduto);
		
		if (desconto < 25 || pProduto > 25000.00) {
			
			JOptionPane.showMessageDialog(null, "Produto: " + nome);
		} else {
			JOptionPane.showMessageDialog(null, "Condi��es n�o satisfeitas");
		}

	}

}
