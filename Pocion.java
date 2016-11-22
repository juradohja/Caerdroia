// Pocion chica (50) - 0
// Pocion mediana (150) - 1
// Pocion grande (300) - 2
// Pocion vacia (0) - 3

public class Pocion{

	private String nombre;
	private int vida;

	public Pocion(int nivel){
		initPotion(nivel);
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	private void initPotion(int nivel){
		switch(nivel){
			case 0:
			nombre = "Poción chica";
			vida = 50;
			break;
			case 1:
			nombre = "Poción mediana";
			vida = 150;
			break;
			case 2:
			nombre = "Poción grande";
			vida = 300;
			break;
			case 3:
			nombre = "Poción vacía";
			vida = 0;
			break;
		}
	}
}