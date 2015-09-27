public class Paralelepipedo {
	
//-------  Declaração de Variaveis 
	double aresta1, aresta2, aresta3;

	public Paralelepipedo() {
		
//------- Instancia de Variaveis		
		if (aresta1 < 0.0) {
			aresta1 = 0.0;
		}
		if (aresta2 < 0.0) {
			aresta2 = 0.0;
		}
		if (aresta3 < 0.0) {
			aresta3 = 0.0;
		}
		
/* Perceba que temos um diferencial de instanciação aqui que implica em
 * ultilizar um laço if (se) que deixa claro que o valor recebido a 
 * qualquer momento pelo programa não pode ser menor que 0.0, caso isso
 * ocorra, conforme o laço criado o programa iguala a variavel a 0.0 */
	}

//------- Metodo que calcula A area externa do Paralelepipedo ----------

	public double CalculeAreaExterna() {						// 7.

		double areaExterna = 0.0;

		areaExterna = (2 * ((aresta1 * aresta2) + (aresta1 * aresta3) + (aresta2 * aresta3)));

		return areaExterna; 									// 9.
	}

//------- Metodo que calcula o Volume do Paralelepipedo ----------------
	public double CalculeVolume() {								// 8.

		double volume = 0.0;

		volume = (aresta1 * aresta2 * aresta3);

		return volume;											//	9.
	}

// -----------------------------GET-------------------------------------

	public void getAresta1(double vAresta1) {					//2
		aresta1 = vAresta1;

	}

	public void getAresta2(double vAresta2) {					//4
		aresta2 = vAresta2;
	}

	public void getAresta3(double vAresta3) {					//6
		aresta3 = vAresta3;
	}

}
