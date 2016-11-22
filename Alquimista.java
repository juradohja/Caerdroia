import java.io.Serializable;

public class Alquimista extends Personaje implements Serializable{

	public Alquimista(String nombre, int nivel){
		super(nombre, nivel);
		vida = vida*85;
		maxVida = vida;
		fuerza = fuerza*10;
		magia = magia*12;
		resistencia = resistencia*4;
		inteligencia = inteligencia*5;
		hFisica = new Habilidad("Transmutacion", 40, 30);
		hMagica = new Habilidad("Crimen Mortal", 15, 65);
	}

	public Alquimista(int nivel){
		super(nivel);
		vida = vida*85;
		maxVida = vida;
		fuerza = fuerza*10;
		magia = magia*12;
		resistencia = resistencia*4;
		inteligencia = inteligencia*5;
		hFisica = new Habilidad("Transmutacion", 40, 30);
		hMagica = new Habilidad("Crimen Mortal", 15, 65);
	}

}
