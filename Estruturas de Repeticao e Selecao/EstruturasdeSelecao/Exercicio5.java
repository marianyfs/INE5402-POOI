import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* ------------------------------------ Exercícios-------------------------------------

		5. Uma empresa de vendas oferece para seus clientes um desconto que é função
		do valor da compra do cliente. Esse desconto é de
		20% se o valor da compra for maior ou igual a R$ 5000,00 e 15%
		se for menor. Faça um programa para imprimir o valor da compra e
		o desconto obtido por um determinado cliente
		
/* -----------------------------------------------------------------------------------*/
		
		double preco = 0.0, precoDesc;

		String vPreco = JOptionPane
				.showInputDialog("Informe o valor do Produto");
		preco = Double.parseDouble(vPreco);

		if (preco >= 5000.00) {

			precoDesc = ((preco * 20) / 100);
			precoDesc = preco - precoDesc;
			
			JOptionPane.showMessageDialog(null, "O Produto de valor: " + preco
					+ " teve desconto de 20 %" + "\n Valor com desconto: " + precoDesc);
		} else {

			precoDesc = ((preco * 15) / 100);
			precoDesc = preco - precoDesc;
			
			JOptionPane.showMessageDialog(null, "O Produto de valor: " + preco
					+ " teve desconto de 15%" + "\n Valor com desconto: " + precoDesc);
		}

	}

}
