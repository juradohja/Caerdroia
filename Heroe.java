public class Heroe{
	private String nombre;
	private int vida;
	private int fuerza;
	private int magia;
	private int resistencia;
	private int inteligencia;
	private int exp;
	private double iniciativa;

	Heroe(String nombre, int vida, int fuerza, int magia, int resistencia int inteligencia, int exp, double iniciativa){
		this.nombre=nombre;
		this.vida=vida;
		this.fuerza=fuerza;
		this.magia=magia;
		this.resistencia=resistencia;
		this.inteligencia=inteligencia;
		this.exp=exp;
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

	public int getExp(){
		return exp;
	}
	public void setExp(int exp){
		this.exp=exp;
	}

	public double getIniciativa(){
		return iniciativa;
	}
	public void setInicativa(double iniciativa){
		this.iniciativa=iniciativa;
	}
}