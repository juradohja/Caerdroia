public class Armadura{
	private String nombre;
	private int resistencia;
	private int inteligencia;

	Armadura(String nombre, int resistencia, int inteligencia){
		this.nombre=nombre;
		this.resistencia=resistencia;
		this.inteligencia=inteligencia;
	}

	public String getNombre(){
		return nombre;
	}

	public int getResistencia(){
		return resistencia;
	}

	public int getInteligencia(){
		return inteligencia;
	}
}