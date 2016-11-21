public class Alquimista extends Personaje{

	public Alquimista(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel);
	}

	public Alquimista(int nivel){
		super(nivel);
		vida = vida*85;
		fuerza = fuerza*10;
		magia = magia*12;
		resistencia = resistencia*4;
		inteligencia = inteligencia*5;
		iniciativa = iniciativa*6;
	}

}