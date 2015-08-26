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
	* trata casos específicos 'do' 'while' 'try' 'catch'
	*/

		do { // Inicio de um bloco de repetição

			try { // código que inclui comandos que podem gerar uma exceção
				
				String valorA = JOptionPane.showInputDialog("Digite o valor inicial");
			// Utilizamos o método JOptionPane.showInputDialog para solicitar ao usuário que informe
			// um dado necessário para que a operação possa ser realizada
				primValor = Integer.parseInt(valorA);
			// O Método JOptionPane trabalha apenas com Strings, por isso devemos converter os valores
			// informados pelo usuário (armazenados em uma String) para o tipo de variavel desejado
			// que permite a manipulação do dado, nesse caso convertemos a String para int (inteiro)
				
				break; // código que 'para' o Try caso a exceção não seja encontrada e "retorna" False para o 'while'

			} catch (NumberFormatException e) { // bloco de tratamento associado a exceção encontrada

				JOptionPane.showMessageDialog(null, 
						"Informe apenas números inteiros"); // Mensagem informando o Usuário sobre o Erro de Digitação
			}
		} while (true); // Condição de repetição que finaliza o laço 'do' caso o while receba um valor falso "fornecido" pelo Try Catch

	// Uma breve explicação:
	
	// Laço de Repetição 'do' 'while(condição)': trabalham em conjunto dentro das chaves 'do' inserimos o queremos que
	// o programa faça ('do') enquanto ('while') uma condição for, ou não, satisfeita.
 
	// Laços 'try' 'catch(exceção)': trabalham em conjunto para tratar determinada exceção captada pelo programa ainda
	// quando este está sendo executado, sem que o programa pare assim que o erro ocorrer, nessa caso, se você apagar os
	// comandos:  linha 23; linha 25; linha 37 à 42 rodar o programa e assim que for solicitado o valor inicial
	// 'Digite o valor inicial' uma palavra, letra ou caracter especial for informado, após dar 'ok', o programa irá parar
	// e uma mensagem de erro será apresentada na IDE. Os comandos 'try' e 'catch' portanto não permitem que isso ocorra
	
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
	// Como visto a cima para fazer uma operação matemática basta utilizar os caracteres
	// e a sequencia lógica respeitando () * / + -

//--------------------- Resultado ----------------------------------
		JOptionPane.showMessageDialog(null, "A soma entre os valores" + primValor + " e " + segValor + " é " + soma);
	// Para mostrar ao usuário uma mensagem que informa resultados ultilizaremos o método	
	// JOPtionPane.showMenssageDialog que em uma caixa de textos expoe a mensagem criada. 
	}


}
