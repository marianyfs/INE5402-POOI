public class Principal {

	public static void main(String[] args) {

		Paralelepipedo umParalelepipedo;
		Interface umaInterface;

		umParalelepipedo = new Paralelepipedo();
		umaInterface = new Interface();

		double vAresta1 = 0.0, vAresta2 = 0.0, vAresta3 = 0.0, vArea = 0.0, vVolume = 0.0;


//----------------------------------------------------------------------

		vAresta1 = umaInterface.PegueAresta1();			// 1.
		umParalelepipedo.getAresta1(vAresta1);			// 2.
		vAresta2 = umaInterface.PegueAresta2();			// 3.
		umParalelepipedo.getAresta2(vAresta2);			// 4.
		vAresta3 = umaInterface.PegueAresta3();			// 5.
		umParalelepipedo.getAresta3(vAresta3);			// 6.
		
//----------------------------------------------------------------------

		vArea = umParalelepipedo.CalculeAreaExterna();	// 7.
		vVolume = umParalelepipedo.CalculeVolume();		// 8.

//----------------------------------------------------------------------

		umaInterface.MostreMensagem(vAresta1, vAresta2, vAresta3, vArea, vVolume);		// 9.
		
	}

}

/*------- ALGORITIMO ---------------------------------------------------
*
* 1. Solicite ao Usuário que informe o Valor da Primeira Aresta;
* 2. Grave o Valor da Primeira Aresta;

* 3. Solicite ao Usuário que informe o Valor da Segunda Aresta;
* 4. Grave o Valor da Segunda Aresta;
* 
* 5. Solicite ao Usuário que informe o Valor da Terceira Aresta;
* 6. Grave o Valor da Terceira Aresta;
* 
* 7. Faça o Calculo da Area Externa do Paralelepipedo onde:
* 		Area Externa = 2 * (aresta1 * aresta2) + (aresta1 * aresta3) + (aresta2 * aresta3)
* 
* 8. Faça o Calculo do Volume do Paralelepipedo onde:
* 		Volume = aresta1 * aresta2 * aresta3
* 
* 9. Informe o Valor das Arestas  informado e também a Area e o Volume Calculados;
*/
