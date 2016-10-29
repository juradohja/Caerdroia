public class Mapa{
	
	private Personaje heroe;
	private Camara[5][5] camaras;
	private int posicionX=0;
	private int posicionY=0;

	public Mapa(Personaje heroe){
		this.heroe = heroe;
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
}