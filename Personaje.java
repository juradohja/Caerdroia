// Alquimista - 0
// Caballero - 1
// Cazador - 2
// Necromancer - 3
// Jefe - 4

public class Personaje{
	private String nombre;
	private int vida;
	private int fuerza;
	private int magia;
	private int resistencia;
	private int inteligencia;
	private int iniciativa;
	private int experiencia;
	private int nivel;
	private Bolsa bolsa;

	public Personaje(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel, Bolsa bolsa) {
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
		this.magia = magia;
		this.resistencia = resistencia;
		this.inteligencia = inteligencia;
		this.iniciativa = iniciativa;
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.bolsa = bolsa;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
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
	public int getIniciativa() {
		return iniciativa;
	}
	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Bolsa getBolsa() {
		return bolsa;
	}
	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}
}