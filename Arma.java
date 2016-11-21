import java.util.Random; // implementar random para todos

public class Arma extends Equipo{

	public Arma(boolean starter){
		super(starter);
		if(starter){
			setAttributes(0);
		} else {
			setAttributes(random.nextInt()); // número de armas que hay
		}
	}

	protected void setAttributes(int tipo){
		switch(tipo){
			case 0: // CAMBIAR CASO CERO A STARTER
			nombre = "Espada Gigante";
			fuerza= 70;
			magia= 0;
			break;

			case 1:
			nombre = "Mazo";
			fuerza= 20;
			magia= 0;
			break;

			case 2:
			nombre = "Hacha Pesada";
			fuerza= 35;
			magia= 0;
			break;

			case 3:
			nombre = "Cuchilla Maldita";
			fuerza= 100;
			magia= 0;
			break;

			case 4:
			nombre = "Tenedor";
			fuerza= 5;
			magia= 0;
			break;

			case 5:
			nombre = "Katana";
			fuerza= 50;
			magia= 0;
			break;

			case 6:
			nombre = "Tridente de Hielo";
			magia= 35;
			fuerza= 0;
			break;

			case 7:
			nombre = "Cetro Oscuro";
			magia= 70;
			fuerza= 0;
			break;

			case 8:
			nombre = "Orbe";
			magia= 50;
			fuerza= 0;
			break;

			case 9:
			nombre = "Palito";
			magia= 5;
			fuerza= 0;
			break;

			case 10:
			nombre = "Báculo";
			magia= 20;
			fuerza= 0;
			break;

			case 11:
			nombre = "Motosierra";
			magia= 100;
			fuerza= 0;
			break;
		}
	}
}
