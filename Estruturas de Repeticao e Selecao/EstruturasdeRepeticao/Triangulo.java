public class Triangulo {

	// Declaração de Variaveis
	
	int base, altura;

	public Triangulo() {

	//Instanciação de Variaveis Declaradas 
		if (base < 0) {
			base = 0;
		}

		if (altura < 0) {
			altura = 0;
		}
	}

	public int calculoArea() {

	//Metodo para calcular a Area de um Triangulo
		int valorArea = 0;

		valorArea = base * altura / 2;

		return valorArea;
	}
	
	//Metodos SET para armazenamento e manipulação

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}



}
