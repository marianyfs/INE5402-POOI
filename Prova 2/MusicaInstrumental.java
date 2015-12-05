
public class MusicaInstrumental extends Musica {
	
	protected String instrumental;

//------------------------------- CONSTRUTOR ---------------------------------------
	public MusicaInstrumental() {
		instrumental = "";
	}

	public MusicaInstrumental(String nome, String autor, String tipo, float tamanho, String instrumental) {
		super(nome, autor, tipo, tamanho);
		this.instrumental = instrumental;
	}

//------------------------------- GETS E SETS --------------------------------------
	public String getInstrumental() {
		return instrumental;
	}

	public void setInstrumental(String instrumental) {
		this.instrumental = instrumental;
	}
	//----- MUSICA
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return super.getAutor();
	}

	@Override
	public void setAutor(String autor) {
		// TODO Auto-generated method stub
		super.setAutor(autor);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}

	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}

	@Override
	public float getTamanho() {
		// TODO Auto-generated method stub
		return super.getTamanho();
	}

	@Override
	public void setTamanho(float tamanho) {
		// TODO Auto-generated method stub
		super.setTamanho(tamanho);
	}
//------------------------- TO STRING ----------------------------------------------

	@Override
	public String toString() {

		return "Musica Instrumental " + nome +
				"\nAutor: " + autor +
				"\nTipo: " + tipo +
				"\nTamanho: " + tamanho +
				"\nInstrumental: " + instrumental + "\n\n";
	}
	
}
