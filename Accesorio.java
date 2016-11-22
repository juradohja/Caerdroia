import java.util.Random;

public class Accesorio extends Equipo{
/*
	public Accesorio(String nombre, int fuerza, int magia, int resistencia, int inteligencia){
		super(nombre, fuerza, magia, resistencia, inteligencia);
	}
*/
	public Accesorio(boolean starter){
		super(starter);
		if(starter){
			setAttributes(12);
		} else {
			setAttributes(random.nextInt(12)); // número de armas que hay
		}
	}

	protected void setAttributes(int tipo){
		switch(tipo){
			case 0: // CAMBIAR CASO CERO A STARTER
			nombre = "Anillo del Rey";
			break;

			case 1:
			nombre = "Anillo de Boda";
			break;

			case 2:
			nombre = "Collar de Gemas";
			break;

			case 3:
			nombre = "Moneda";
			break;

			case 4:
			nombre = "Alma Perdida";
			break;

			case 5:
			nombre = "Pulsera de Goma";
			break;

			case 6:
			nombre = "Hada en Botella";
			break;

			case 7:
			nombre = "Espejo Maldito";
			break;

			case 8:
			nombre = "Foto de Gatito";
			break;

			case 9:
			nombre = "Cuerno de Demonio";
			break;

			case 10:
			nombre = "Libro de Magia";
			break;

			case 11:
			nombre = "Vitamina";
			break;

			case 12:
			nombre = "Pelusa";
			break;
		}
	}

}
