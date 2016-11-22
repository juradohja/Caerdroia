public class Jefe extends Personaje{

	public Jefe(int nivel){
		super(nivel);
		hFisica = new Habilidad("Habilidad Física", 0, 0);
		hMagica = new Habilidad("Habilidad Mágica", 0, 0);
	}

}