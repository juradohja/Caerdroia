public class Enemigo{
	private String nombre;
	private int vida;
	private int fuerza;
	private int magia;
	private int resistencia;
	private int inteligencia;
	private double iniciativa;

	Enemigo(String nombre, int vida, int fuerza, int magia, int resistencia int inteligencia, double iniciativa){
		this.nombre=nombre;
		this.vida=vida;
		this.fuerza=fuerza;
		this.magia=magia;
		this.resistencia=resistencia;
		this.inteligencia=inteligencia;
	}

	public String getNombre(){
		return nombre;
	}

	public int getVida(){
		return vida;
	}
	public void setVida(int vida){
		this.vida=vida;
	}

	public String getFuerza(){
		return fuerza;
	}
	public void setFuerza(int fuerza){
		this.fuerza=fuerza;
	}

	public String getMagia(){
		return magia;
	}
	public int setMagia(int magia){
		this.magia=magia;
	}

	public int getResistencia(){
		return resistencia;
	}
	public void setResistencia(int resistencia){
		this.resistencia=resistencia;
	}

	public int getInteligencia(){
		return  inteligencia;
	}
	public void setInteligencia(int resistencia){
		this.inteligencia=inteligencia;
	}

	public double getIniciativa(){
		return iniciativa;
	}
	public void setInicativa(double iniciativa){
		this.iniciativa=iniciativa;
	}
}