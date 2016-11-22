public class Habilidad{
	private nombre;
	private fuerza;
	private magia;

	public Habilidad(String nombre, int fuerza, int magia){
		this.nombre = nombre;
		this.fuerza = nivel;
		this.magia = nivel;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza(){
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getMagia(){
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}
}