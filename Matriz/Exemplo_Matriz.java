

public class Exemplo_Matriz {

	private int linha = 0, coluna = 0;
	private int [] [] matriz;
	
	public Exemplo_Matriz() { // Construtor sem parâmetros
		
		super();		
	}

	public Exemplo_Matriz(int ordem) { // Construtor com o parâmetro que define a ordem da Matriz
		
		matriz = new int [ordem][ordem];
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int somalinha (int linhaSoma){
		
		int somaDaLinha = 0;
			
			for (int coluna = 0; coluna < matriz.length; coluna++){
							
				somaDaLinha += matriz[linhaSoma][coluna];
			}
		
		return somaDaLinha;
	}
	

}
