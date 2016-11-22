import java.io.Serializable;
import java.util.Random;

public class Casco extends Equipo implements Serializable{
/*
	public Casco(String nombre, int fuerza, int magia, int resistencia, int inteligencia){
		super(nombre, fuerza, magia, resistencia, inteligencia);
	}
*/
	public Casco(boolean starter){
		super(starter);
		if(starter){
			setAttributes(4);
		} else {
			setAttributes(random.nextInt(4)); // número de armas que hay
		}
	}

	protected void setAttributes(int tipo){
		switch (tipo) {
			case 0:
			nombre= "Máscara";
			resistencia= 10;
			inteligencia= 10;
			break;

			case 1:
			nombre= "Casco de Cuero";
			resistencia= 15;
			inteligencia= 15;
			break;

			case 2:
			nombre= "Casco de Acero";
			resistencia= 20;
			inteligencia= 20;
			break;

			case 3:
			nombre= "Sombrero Daedrico";
			resistencia= 25;
			inteligencia= 25;
			break;
				
			case 4:
			nombre= "Gorra";
			resistencia= 5;
			inteligencia= 5;
			break;
		}
	}

}
