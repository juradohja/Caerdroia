import java.util.Random; // implementar random para todos

public class Arma extends Equipo{
	private String nombre;
	private int fuerza;
	private int magia;
	private Random random;

	public Arma(){
		random = new Random();
		setAttributes(random.nextInt()); // número de armas que hay
	}

	public String getNombre(){
		return nombre;
	}

	public int getFuerza(){
		return fuerza;
	}

	public int getMagia(){
		return magia;
	}

	private void setAttributes(int tipo){
		switch(tipo){
			case 0:
			nombre = "Martillo";
			fuerza = 50;
			break;

			//completar
		}
	}
}