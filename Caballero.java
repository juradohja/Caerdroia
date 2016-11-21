public class Caballero extends Personaje{

	public Caballero(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel);
	}

	public Caballero(int nivel){
		super(nivel);
		vida = vida*100;
		fuerza = fuerza*12;
		magia = magia*10;
		resistencia = resistencia*5;
		inteligencia = inteligencia*4;
		iniciativa = iniciativa*5;
	}

}