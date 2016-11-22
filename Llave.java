import java.io.Serializable;

public class Llave implements Serializable{

	private int nivel;

	public Llave(int nivel) {
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}



}