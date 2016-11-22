import java.io.Serializable;
public class Necromancer extends Personaje implements Serializable{

	public Necromancer(String nombre, int nivel){
		super(nombre, nivel);
		vida = vida*75;
		maxVida = vida;
		fuerza = fuerza*7;
		magia = magia*16;
		resistencia = resistencia*3;
		inteligencia = inteligencia*4;
		hFisica = new Habilidad("Necrosis", 35, 15);
		hMagica = new Habilidad("Toque Cadaverico", 10, 80);
	}

	public Necromancer(int nivel){
		super(nivel);
		vida = vida*75;
		maxVida = vida;
		fuerza = fuerza*7;
		magia = magia*16;
		resistencia = resistencia*3;
		inteligencia = inteligencia*4;
		hFisica = new Habilidad("Necrosis", 35, 15);
		hMagica = new Habilidad("Toque Cadaverico", 10, 80);
	}

}
