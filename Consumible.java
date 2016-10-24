public class Consumible{
	private String nombre;
	private int cura;
	private int cantidad;

	Consumible(String nombre, int cura, int cantidad){
		this.nombre=nombre;
		this.cura=cura;
		this.cantidad=cantidad;
	}

	public String getNombre(){
		return nombre;
	}

	public int getCura(){
		return cura;
	}

	public int getCantidad(){
		return cantidad;
	}
	public void setCantidad(String cantidad){
		this.cantidad=cantidad;
	}
}