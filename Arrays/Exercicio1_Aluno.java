public class Exercicio1_Aluno {

	private String nome;
	private int matricula;
	private double[] notas;
	private double media;

// --- CONSTRUTOR -----------------------------------------------------------------

	public Exercicio1_Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		notas = new double[3];
		media = 0.0;
	}
	
// ---GETS E SETS -----------------------------------------------------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

// --- CALCULO DA MEDIA -----------------------------------------------------------------
	
	public double calculoMedia() {

		double somaNotas = 0.0;

		for (int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];
		}

		media = somaNotas / notas.length;

		return media;
	}

	private double maiorNota = 0.0, menorNota = 20.0;
	
// ---CALCULO MAIOR NOTA -----------------------------------------------------------------

	public double calculoMaiorNota(){
		
		for (int i = 0; i < notas.length; i++) {
			
			if (maiorNota < notas[i]) {
				maiorNota = notas[i];
			}
		}
		
		return maiorNota;
	}
// ---CALCULO MENOR NOTA -----------------------------------------------------------------

	public double calculoMenorNota(){
		
		for (int i = 0; i < notas.length; i++) {
			
			if (menorNota > notas[i]) {
				menorNota = notas[i];
			}
		}
		
		return menorNota;
	}
	
// ---CALCULO DA DIFERENÇA ENTRE A MAIOR E A MENOR NOTA -----------------------------------------------------------------
	
	public double diferencaNotas(){
		
		double diferenca = 0.0;
		
		diferenca = maiorNota - menorNota;
		
		return diferenca;
	}
}
