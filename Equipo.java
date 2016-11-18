// Accesorio - 0
// Arma - 1
// Botas - 2
// Casco - 3
// Peto - 4

public class Equipo{

	protected String nombre;
	protected int fuerza;
	protected int magia;
	protected int resistencia;
	protected int inteligencia;

	public Equipo(String nombre, int fuerza, int magia, int resistencia, int inteligencia) {
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.magia = magia;
		this.resistencia = resistencia;
		this.inteligencia = inteligencia;
	}

	public Equipo(){
		
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