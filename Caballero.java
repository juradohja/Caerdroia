import java.io.Serializable;
public class Caballero extends Personaje implements Serializable{

	public Caballero(String nombre, int nivel){
		super(nombre, nivel);
		vida = vida*100;
		maxVida = vida;
		fuerza = fuerza*12;
		magia = magia*10;
		resistencia = resistencia*5;
		inteligencia = inteligencia*4;
		hFisica = new Habilidad("Espada Sagrada", 65, 15);
		hMagica = new Habilidad("Furia de Guerra", 30, 40);
	}

	public Caballero(int nivel){
		super(nivel);
		vida = vida*100;
		maxVida = vida;
		fuerza = fuerza*12;
		magia = magia*10;
		resistencia = resistencia*5;
		inteligencia = inteligencia*4;
		hFisica = new Habilidad("Espada Sagrada", 65, 15);
		hMagica = new Habilidad("Furia de Guerra", 30, 40);
	}

}
