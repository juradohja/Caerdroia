// Alquimista - 0
// Caballero - 1
// Cazador - 2
// Necromancer - 3
// Jefe - 4
 
public class Personaje{
	
	protected String nombre;
	protected int vida;
	protected int fuerza;
	protected int magia;
	protected int resistencia;
	protected int inteligencia;
	protected int iniciativa;
	protected int experiencia;
	protected int nivel;
	protected Bolsa bolsa;

	public Personaje(String nombre, int nivel) {
		bolsa = new Bolsa();
		this.nombre = nombre;
		this.experiencia = experiencia;
		
		this.nivel = nivel;
		this.vida = nivel;
		this.fuerza = nivel;
		this.magia = nivel;
		this.resistencia = nivel;
		this.inteligencia = nivel;
		this.iniciativa = nivel;
	}

	public Personaje(int nivel){
		this.nivel = nivel;
		this.vida = nivel;
		this.fuerza = nivel;
		this.magia = nivel;
		this.resistencia = nivel;
		this.inteligencia = nivel;
		this.iniciativa = nivel;
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