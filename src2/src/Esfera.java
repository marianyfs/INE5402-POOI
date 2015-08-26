public class Esfera {
	

//-------  Declaração de Variaveis --------------------=----------------

	double raio;
	double volume;

	public Esfera() {

//------- Instancia de Variaveis ---------------------------------------
		raio = 0.0;
		volume = 0.0;
	}

//-------  Metodo que calcula o Volume da Esfera -----------------------

	public double fornecaVolume() {

		volume = (4 * Math.PI) * (Math.pow(raio, 3) / 3);
		// Math.PI : Método criado que comporta o valor de PI
		// Math.pow(base,expoente) : Método que trabalha com Potenciação onde, nesse caso: (raio³)

		return volume;
	}
//-------  Método que recebe o valor de uma variavel -------------------

	/* Este método é ultilizado em conjunto com a Classe Interface e Principal
	* é responsável por gravar (por isso é um método sem retorno 'void')
	* o valor do raio digitado pelo usuário em uma variavel local (da classe Esfera)
	* que será ultilizada no método fornecaVolume obedecendo os pontos do 1. e 2. do
	* ALGORÍTIMO exposto na Classe Principal */

	public void recebaRaio(double vRaio) {
	raio = vRaio;
	}
	

}
