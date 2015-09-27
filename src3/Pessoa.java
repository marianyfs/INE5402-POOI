public class Pessoa {
//-------  Declaração de Variaveis -------------------------------------
	String nome;
	int idade;
	double altura;

	public Pessoa() {
//------- Instancia de Variaveis ---------------------------------------

		nome = "";

		if (idade < 0) {
			idade = 0;
		}

		if (altura < 0.0) {
			altura = 0.0;
		}
	}
//------- Metodo que calcula o Peso Ideal ------------------------------
	public double FornecaPesoIdeal() {							// 7.
		double pesoIdeal = 0.0;

		pesoIdeal = ((72.7 * altura) - 58.0);

		return pesoIdeal;
	}
	
// -----------------------------GET-------------------------------------
	public void getNome(String vNome) {							// 2.
		nome = vNome;
	}

	public void getIdade(int vIdade) {							// 4.
		idade = vIdade;
	}

	public void getAltura(double vAltura) {						// 6.
		altura = vAltura;
	}

}
