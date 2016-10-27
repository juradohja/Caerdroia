public class Equipo{

	private String nombre;
	private int fuerza;
	private int magia;
	private int resistencia;
	private int inteligencia;

	public Equipo(String nombre, int fuerza, int magia, int resistencia, int inteligencia) {
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.magia = magia;
		this.resistencia = resistencia;
		this.inteligencia = inteligencia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
}