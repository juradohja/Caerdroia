import java.util.Random;

public class Mapa{
	
	private Personaje heroe;
	private Camara camaras;
	private int posicionX=0;
	private int posicionY=0;
	private Random random;

	public Mapa(Personaje heroe){
		this.heroe = heroe;
		random = new Random();
		camaras = new Camara[5][5];
		initChambers();
	}

	public Personaje getHeroe() {
		return heroe;
	}

	public void setHeroe(Personaje heroe) {
		this.heroe = heroe;
	}

	public void setCamara(Camara camara, int i, int j){
		camaras[i][j] = camara;
	}

	public Camara getCamara(int i, int j){
		return camaras[i][j];
	}

	public void setPosicionX(int posicionX){
		posicionX = this.posicionX;
	}

	public int getPosicionX(){
		return posicionX;
	}

	public void setPosicionY(int posicionY){
		posicionY = this.posicionY;
	}

	public int getPosicionY(){
		return posicionY;
	}

	private void initChambers(){
	/*	int tipoEnemigo = random.nextInt(4);
		int nivelEnemigo = 1;
		int tipoEquipo = random.nextInt(5);
		int tipoPocion = random.nextInt(3);
		int llave = 0;
		int up = 0;
		int down = 2;
		int left = 0;
		int right = 0;
		String acertijo;
		String respuesta;
		int nivel = 1;
	*/

	}
}