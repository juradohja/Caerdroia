public class Cazador extends Personaje{

	public Cazador(String nombre, int nivel){
		super(nombre, nivel);
		vida = vida*65;
		fuerza = fuerza*16;
		magia = magia*7;
		resistencia = resistencia*4;
		inteligencia = inteligencia*3;
		iniciativa = iniciativa*10;
		hFisica = new Habilidad("Habilidad Física", 0, 0);
		hMagica = new Habilidad("Habilidad Mágica", 0, 0);

	}

	public Cazador(int nivel){
		super(nivel);
		vida = vida*65;
		fuerza = fuerza*16;
		magia = magia*7;
		resistencia = resistencia*4;
		inteligencia = inteligencia*3;
		iniciativa = iniciativa*10;
		hFisica = new Habilidad("Habilidad Física", 0, 0);
		hMagica = new Habilidad("Habilidad Mágica", 0, 0);
	}

}