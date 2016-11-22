import java.util.Random;

public class Botas extends Equipo{
/*
	public Botas(String nombre, int fuerza, int magia, int resistencia, int inteligencia){
		super(nombre, fuerza, magia, resistencia, inteligencia);
	}
*/
	public Botas(boolean starter){
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
			nombre= "Chanclas";
			resistencia= 10;
			inteligencia= 10;
			break;

			case 1:
			nombre= "Botas de piel";
			resistencia= 15;
			inteligencia= 15;
			break;

			case 2:
			nombre= "Tenis";
			resistencia= 20;
			inteligencia= 20;
			break;

			case 3:
			nombre= "Botas Metálicas";
			resistencia= 25;
			inteligencia= 25;
			break;
				
			case 4:
			nombre= "Botas";
			resistencia= 5;
			inteligencia= 5;
			break;
		}
	}

}
