public class Arma extends Equipo{
	private String nombre;
	private int fuerza;
	private int magia;

	public Arma(String nombre, int fuerza, int magia){
		this.nombre=nombre;
		this.fuerza=fuerza;
		this.magia=magia;
	}

	public String getNombre(){
		return nombre;
	}

	public int getFuerza(){
		return fuerza;
	}

	public int getMagia(){
		return magia;
	}
}