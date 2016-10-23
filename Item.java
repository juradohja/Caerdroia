public class Item{
	private String nombre;
	private int modfuerza;
	private int modmagia;
	private int modresistencia;
	private int modinteligencia;

	Item(String nombre, int modfuerza, int modprotected , int modresistencia, int modinteligencia){
		this.nombre=nombre;
		this.modfuerza=modfuerza;
		this.modmagia=modmagia;
		this.modresistencia=modresistencia;
		this.modinteligencia=modinteligencia;
	}

	public String getNombre(){
		return nombre;
	}

	public int getModfuerza(){
		return modfuerza;
	}

	public int getModmagia(){
		return modmagia;
	}

	public int getModresistencia(){
		return modresistencia;
	}

	public int getModinteligencia(){
		return modinteligencia;
	}
}