import javax.swing.JOptionPane;
/*Implemente um programa que:
• O usuário informa a ordem da matriz;
• O usuário informa os elementos da matriz;
• A   lógica   da   aplicação   calcula   a   soma   da
segunda linha da matriz;
• A lógica da aplicação calcula a soma de todos
os elementos da matriz.
• A  aplicação  deve  ser  implementada  seguindo
uma arquitetura em três camadas.*/

public class Exemplo_Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exemplo_Interface Interface = new Exemplo_Interface();
		int ordem = Interface.getInteger("Informe a Ordem da Matriz");

		Exemplo_Matriz Matriz = new Exemplo_Matriz(ordem);
		
		int [][] mat = Matriz.getMatriz();
		int somaElementos = 0;
		
		for (int linha = 0; linha < mat[0].length; linha++){
			
			for (int coluna = 0; coluna < mat.length; coluna++){
				
				mat[linha][coluna] = Interface.getInteger("Informe o valor a ser armazenado (Linha: [ " + (linha +1) + " ] " + " Coluna: [ " + (coluna +1) + " ])");
				
				somaElementos += mat [linha][coluna];
			}
			
		}
		
		int linhaSoma = Integer.parseInt(JOptionPane.showInputDialog("Informe a linha a ser somada"));
		
		JOptionPane.showMessageDialog(null,"A soma da Matriz em geral é: " + somaElementos + "\n" +
										   " A soma da Segunda linha da Matriz é: " + Matriz.somalinha(linhaSoma));
		
		
		
	}

}