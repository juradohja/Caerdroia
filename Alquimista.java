public class Alquimista extends Personaje{

	public Alquimista(String nombre, int nivel){
		super(nombre, nivel);
		vida = vida*85;
		fuerza = fuerza*10;
		magia = magia*12;
		resistencia = resistencia*4;
		inteligencia = inteligencia*5;
		iniciativa = iniciativa*6;
		hFisica = new Habilidad("Transmutacion", 40, 30);
		hMagica = new Habilidad("Crimen Mortal", 15, 65);
	}

	public Alquimista(int nivel){
		super(nivel);
		vida = vida*85;
		fuerza = fuerza*10;
		magia = magia*12;
		resistencia = resistencia*4;
		inteligencia = inteligencia*5;
		iniciativa = iniciativa*6;
		hFisica = new Habilidad("Transmutacion", 40, 30);
		hMagica = new Habilidad("Crimen Mortal", 15, 65);
	}

}