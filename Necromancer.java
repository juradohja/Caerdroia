public class Necromancer extends Personaje{

	public Necromancer(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel);
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