public class Cazador extends Personaje{

	public Cazador(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel, bolsa);
	}

	public Cazador(int nivel){
		super(nivel);
		vida = vida*65;
		fuerza = fuerza*16;
		magia = magia*7;
		resistencia = resistencia*4;
		inteligencia = inteligencia*3;
		iniciativa = iniciativa*10;
	}

}