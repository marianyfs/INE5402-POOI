import java.util.Arrays;


public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface aInterface = new Interface();
		
		Musica [] musicasTocadas = new Musica [10];
		Arrays.fill(musicasTocadas, null);
		
		Musica a = new Musica("Paradase", "Coldplay", "Pop", 50);
		Musica b = new Musica("Teatro dos Vampiros", "Legiao Urbana", "Pop", 100);
		Musica c = new Musica("Me encontra", "Charlie Brown Jr.", "Rock", 100);
		Musica d = new Musica("Sera", "Legiao Urbana", "Rock", 150);
		Musica e = new Musica("Na sua estante", "Pitty", "Rock", 100);
		Musica f = new Musica("Kiss me", "Ed Sheeran", "Pop", 100);
		Musica g = new MusicaInstrumental("Alone", "Yiruma", "Piano", 100, "Instrumental");
		Musica h = new MusicaInstrumental("For you", "Yiruma", "Piano", 100, "Instrumental");
		Musica i = new MusicaInstrumental("Hello", "Adele", "Piano", 100, "Instrumental");
		
		musicasTocadas[0] = a;
		musicasTocadas[1] = b;
		musicasTocadas[2] = c;
		musicasTocadas[3] = d;
		musicasTocadas[4] = e;
		musicasTocadas[5] = f;
		musicasTocadas[6] = g;
		musicasTocadas[7] = h;
		musicasTocadas[8] = i;

		Radio aRadio = new Radio(musicasTocadas);
		
		
		aInterface.showMenssage(Arrays.toString(aRadio.MusicasMesmoAutor(aInterface.getString("Digite o Nome do Autor"))));
		aInterface.showMenssage(aRadio.tocaMusica(aInterface.getInteger("Digite a posicao no Array")));
		aInterface.showMenssage(Integer.toString(aRadio.retornaNumeroMusicasTipoX(aInterface.getString("Digite o Tipo"))));
		aInterface.showMenssage("A Musica procurada tem valor: " + Boolean.toString(aRadio.musicaInstrumental(aInterface.getInteger("Digite a Posicao no Array"))) +
								"\n Para a caracteristica Instrumental");
		
		aInterface.showMenssage("TESTE DOS METODOS TO STRING");
		aInterface.showMenssage("ToString Musica: \n\n" + musicasTocadas[0].toString());
		aInterface.showMenssage("ToString Musica Instrumental: \n\n" + musicasTocadas[7].toString());
		aInterface.showMenssage("ToString Radio: \n\n" + aRadio.toString());
	}
}
