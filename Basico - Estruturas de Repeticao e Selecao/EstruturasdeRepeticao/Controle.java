import javax.swing.JOptionPane;

public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//  Declaração e Instancia de uma classe como Objeto
		
		Triangulo umTriangulo;
		Interface umaInterface;

		umTriangulo = new Triangulo();
		umaInterface = new Interface();

		int contador = 0;
	
//------------------- Laço de repetição While abordado em sala --------------------------------------------		

		while (contador < 2) {
			
			int base = 0, altura = 0, resultadoArea = 0;
			
			JOptionPane.showMessageDialog(null, "Laço (while) {}");               // 1.

			base = umaInterface.pegueValor("Informe a Base");                     // 2.
			umTriangulo.setBase(base);                                            // 2.1

			altura = umaInterface.pegueValor("Informe a Altura");                 // 3
			umTriangulo.setAltura(altura);                                        // 3.1

			resultadoArea = umTriangulo.calculoArea();                            // 4
			
			umaInterface.mostreResultado("O Triangulo: Base = " + base +          //5
													"; Altura = " + altura + ";\n" +
												   "\n Possui Area = " + resultadoArea);
			
			contador ++; //incremento do contador
		}
		
//------------------- Laço de repetição Do While abordado em sala --------------------------------------------		

		 int doContador = 0;
		
		do {
			
			int base = 0, altura = 0, resultadoArea = 0;
			
			JOptionPane.showMessageDialog(null, "Laço: do {} (while)");           // 1.

			base = umaInterface.pegueValor("Informe a Base");                     // 2.
			umTriangulo.setBase(base);                                            // 2.1

			altura = umaInterface.pegueValor("Informe a Altura");                 // 3
			umTriangulo.setAltura(altura);                                        // 3.1

			resultadoArea = umTriangulo.calculoArea();                            // 4
			
			umaInterface.mostreResultado("O Triangulo: Base = " + base +          //5
													"; Altura = " + altura + ";\n" +
												   "\n Possui Area = " + resultadoArea);
			
			doContador ++; // Incremento do contador
			
		} while (doContador < 2);
	
//------------------- Laço de repetição For abordado em sala --------------------------------------------		
		
		for (int forContador = 0; forContador < 2; forContador++) {

			JOptionPane.showMessageDialog(null, "Laço: for() {} ");             // 1.

			umTriangulo.setBase(umaInterface.pegueValor("Informe a Base"));     // 2. e 2.1

			umTriangulo.setAltura(umaInterface.pegueValor("Informe a Altura")); // 3 e 3.1

			umaInterface.mostreResultado("O Triangulo possui Area = " + 		// 4 e 5
										umTriangulo.calculoArea());
		}

	}

}


/* ------------------------------------- ALGORITIMO  ------------------------------------		
*
* 1. Informe qual o Laço de Repetição usado;
* 2. Pegue o valor da Base do Triangulo;
*    2.1 Guarde o valor da Base
* 3. Pegue o valor da Altura do Triangulo;
*    3.1 Guade o valor da Altura
* 4. Calcule a Area do Triangulo
* 5. Mostre o resuldado do calculo
* 
*/
