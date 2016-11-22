public class Caballero extends Personaje{

	public Caballero(String nombre, int nivel){
		super(nombre, nivel);
		vida = vida*100;
		fuerza = fuerza*12;
		magia = magia*10;
		resistencia = resistencia*5;
		inteligencia = inteligencia*4;
		iniciativa = iniciativa*5;
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