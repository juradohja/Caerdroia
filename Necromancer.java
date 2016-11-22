public class Necromancer extends Personaje{

	public Necromancer(String nombre, int nivel){
		super(nombre, nivel);
		vida = vida*75;
		fuerza = fuerza*7;
		magia = magia*16;
		resistencia = resistencia*3;
		inteligencia = inteligencia*4;
		iniciativa = iniciativa*8;
	}

	public Necromancer(int nivel){
		super(nivel);
		vida = vida*75;
		fuerza = fuerza*7;
		magia = magia*16;
		resistencia = resistencia*3;
		inteligencia = inteligencia*4;
		iniciativa = iniciativa*8;
	}

}