public class Mapa{
	
	private Personaje heroe;
	private Camara[5][5] camaras;

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
}