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
			nombre = "Espada Gigante";
			fuerza =70;
			break;

			case 1:
			nombre = "Mazo";
			fuerza= 20;
			break;

			case 2:
			nombre = "Hacha Pesada";
			fuerza= 35;
			break;

			case 3:
			nombre = "Cuchilla Maldita";
			fuerza= 100;
			break;

			case 4:
			nombre = "Tenedor";
			fuerza= 5;
			break;

			case 5:
			nombre = "Katana";
			fuerza= 50;
			break;

			case 6:
			nombre = "Tridente de Hielo";
			magia= 35;
			break;

			case 7:
			nombre = "Cetro Oscuro";
			magia= 70;
			break;

			case 8:
			nombre = "Orbe";
			magia= 50;
			break;

			case 9:
			nombre = "Palito";
			magia= 5;
			break;

			case 10:
			nombre = "Báculo";
			magia= 20;
			break;

			case 11:
			nombre = "Motosierra";
			magia= 100;
			break;
		}
	}
}
