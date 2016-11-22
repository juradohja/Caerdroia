import java.io.Serializable;

public class Jefe extends Personaje implements Serializable{

	public Jefe(int nivel){
		super(nivel);
		vida = vida*140;
		maxVida = vida;
		fuerza = fuerza*11;
		magia = magia*11;
		resistencia = resistencia*8;
		inteligencia = inteligencia*8;
		iniciativa = iniciativa*8;
		hFisica = new Habilidad("Omega", 60, 30);
		hMagica = new Habilidad("Oblivion", 30, 60);
	}

}
