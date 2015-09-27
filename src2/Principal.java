public class Principal {

	public static void main(String[] args) {
		
//------- Declaração da Classe como um Objeto --------------------------
		
		Esfera umaEsfera;
		Interface umaInterface;
		
//------- Instanciação do Objeto de determinada Classe -----------------

		umaEsfera = new Esfera();
		umaInterface = new Interface();
		
//-------Declaração de Variaveis Locais --------------------------------

		double vRaio = 0;
		double vVolume = 0;

//------- Execução do Algorítimo----------------------------------------

		vRaio = umaInterface.pegueValorRaio();  // 1.
		umaEsfera.recebaRaio(vRaio);            // 2.
		vVolume = umaEsfera.fornecaVolume();    // 3.
		umaInterface.mostreVolume(vVolume);     // 4.

	}

}

/*------- ALGORITIMO ---------------------------------------------------
 * 
 * 1. Solicite ao usuário que informe o Valor do Raio;
 * 
 * 2. Grave o Valor Informado na Classe Esfera;
 * 
 * 3. Faça o Calculo de Volume onde:
 * 		Volume = 4 * PI * raio³ / 3
 * 
 * 4. Informe o Volume Calculado
 * 5. Finalize o Programa
 * */
