public class Questao1_Modelo {

	// DECLARACAO DE VARIAVEIS

	double massaInicial, massaFinal;
	int tempo;

	// INSTANCIACAO DE VARIAVEIS NO CONSTRUTOR

	public Questao1_Modelo() {

		massaInicial = 0;
		massaFinal = 0;
		tempo = 0;

	}

	// METODO DE CALCULO

	public int CalculoTempoPercorrido() {

		do {

			massaFinal = massaInicial / 2;

			massaInicial = massaFinal;

			tempo += 50;

		} while (massaFinal >= 0.05);

		return tempo;

	}

	// SET

	public void MassaInicial(double valor) {
		massaInicial = valor;
	}

}
