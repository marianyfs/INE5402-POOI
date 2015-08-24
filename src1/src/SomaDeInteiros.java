import javax.swing.JOptionPane;

public class SomaDeInteiros {

	public static void main (String [] parametros){

//--------------------- Declaração de Variaveis --------------------
		int primValor, segValor, soma;

//--------------------- Instancia de Variaveis --------------------- 
		primValor = 0;
		segValor = 0;
		soma = 0;

//--------------------- Solicitação e Conversão dos Valores --------

/* 
* Para efetuar uma conversão de modo que exceções como receber letras
* em variaveis int; double; float não ocorra ultilizaremos um laço  que 
* trata casos específicos
*/

		do { // Inicio de um bloco de repetição

			try { // código que inclui comandos que podem gerar uma situação de exceção
				
				String valorA = JOptionPane.showInputDialog("Digite o valor inicial"); // Solicitação do valor
				primValor = Integer.parseInt(valorA); // Conversão do Valor
				
				break; // código que 'para' o Try caso a exceção não seja encontrada e "retorna" False para o 'while'

			} catch (NumberFormatException e) { // bloco de tratamento associado a exceção encontrada

				JOptionPane.showMessageDialog(null, 
						"Informe apenas números inteiros"); // Mensagem informando o Usuário sobre o Erro de Digitação
			}
		} while (true); // Condição de repetição que finaliza o laço 'do' caso o while receba um valor falso "fornecido" pelo Try Catch


		do {
			try {
				String valorB = JOptionPane.showInputDialog("Digite o valor a ser Somado");
				segValor = Integer.parseInt(valorB);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
			}
			
		} while (true);

//--------------------- Calculo ------------------------------------
		soma = primValor + segValor;

//--------------------- Resultado ----------------------------------
		JOptionPane.showMessageDialog(null, "A soma entre os valores" + primValor + " e " + segValor + " é " + soma);
	}


}
