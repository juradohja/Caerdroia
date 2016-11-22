import java.io.Serializable;
import java.util.Random;

public class Peto extends Equipo implements Serializable{
/*	
	public Peto(String nombre, int fuerza, int magia, int resistencia, int inteligencia){
		super(nombre, fuerza, magia, resistencia, inteligencia);
	}
*/
	public Peto(boolean starter){
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
			nombre= "Chaleco";
			resistencia= 5;
			inteligencia= 5;
			break;

			case 1:
			nombre= "Cota de Malla";
			resistencia= 10;
			inteligencia= 10;
			break;

			case 2:
			nombre= "Tunica Encantada";
			resistencia= 15;
			inteligencia= 15;
			break;

			case 3:
			nombre= "Armadura de Eridium";
			resistencia= 20;
			inteligencia= 20;
			break;
			
			case 4:
			nombre= "Ropa Casual";
			resistencia= 5;
			inteligencia= 5;
		}
	}

}
