import java.util.Arrays;


public class Radio {
	
	protected Musica [] musicasTocadas;

//------------------------------- CONSTRUTOR ---------------------------------------
	public Radio(Musica[] musicasTocadas) {
		super();
		this.musicasTocadas = musicasTocadas;
	}

	public Radio() {
		musicasTocadas = new Musica [10];
		Arrays.fill(musicasTocadas, null);
	}
	
//------------------------------- GETS E SETS --------------------------------------
	public Musica[] getMusicasTocadas() {
		return musicasTocadas;
	}

	public void setMusicasTocadas(Musica[] musicasTocadas) {
		this.musicasTocadas = musicasTocadas;
	}
	
//------------------------- TO STRING ----------------------------------------------
	@Override
	public String toString() {
		return "Radio: " +
				"\n Musicas Tocadas: " + Arrays.toString(musicasTocadas) + "\n\n";
	}
	
	public Musica[] MusicasMesmoAutor (String autor){
		
		Musica[] musicasMesmoAutor = new Musica [10];
		Arrays.fill(musicasMesmoAutor, null);
		
		for (int i = 0; musicasTocadas[i] != null && i < musicasTocadas.length; i++){
			
			if (musicasTocadas[i].getAutor().equals(autor)){
				
				musicasMesmoAutor[i] = musicasTocadas[i];
			
			} else musicasMesmoAutor[i] = null;
		}
		
		return musicasMesmoAutor;
	}
	
	public String tocaMusica(int i){
		 
			if (musicasTocadas[i].getTipo().equals("Rock")){
		
			return musicasTocadas[i].getNome();
			
			} else return "A Musica nao e do tipo ROCK";
		
	}
	
	public int retornaNumeroMusicasTipoX (String tipoX){
		int quantidadeTipoX = 0;
		
		for (int i = 0; musicasTocadas[i] != null && i < musicasTocadas.length; i++){
			
			if(musicasTocadas[i].getTipo().equals(tipoX)){
				quantidadeTipoX ++;
			}
		}
		return quantidadeTipoX;
	}
	
	public boolean musicaInstrumental(int i){
		
		for (int j = 0; musicasTocadas[j] != null && j < musicasTocadas.length; j++){
			
			if (musicasTocadas[i] instanceof MusicaInstrumental){
				return true;
			}
		} return false;
	}
	
	


}
