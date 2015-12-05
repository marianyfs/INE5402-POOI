
public class Musica {
	
	protected String nome, autor, tipo;
	protected float tamanho;
	
//---------------------------- CONSTRUTORES ---------------------------------------	
	public Musica() {
	
		nome = "null";
		autor = "null";
		tipo = "null";
		tamanho = 0;
	}


	public Musica(String nome, String autor, String tipo, float tamanho) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.tipo = tipo;
		this.tamanho = tamanho;
	}
//------------------------------ GETS E SETS --------------------------------------
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public float getTamanho() {
		return tamanho;
	}


	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
//------------------------------ OUTROS METODOS -----------------------------------	
	
	@Override
	public String toString() {
		return "Musica " + nome +
				"\nAutor: " + autor +
				"\nTipo: " + tipo +
				"\nTamanho: " + tamanho + "\n\n";
	}

	
}
