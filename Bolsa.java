public class Bolsa{
	
	private Arma arma;
	private Casco casco;
	private Botas botas;
	private Peto peto;
	private Accesorio accesorio;
	private Llave llave;
	private Pocion[] pociones;

	public Bolsa() {
		pociones = new Pocion[5];
		this.arma = new Arma(true);
		this.casco = new Casco(true);
		this.botas = new Botas(true);
		this.peto = new Peto(true);
		this.accesorio = new Accesorio(true);
	//	this.llave = llave;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Casco getCasco() {
		return casco;
	}
	public void setCasco(Casco casco) {
		this.casco = casco;
	}
	public Botas getBotas() {
		return botas;
	}
	public void setBotas(Botas botas) {
		this.botas = botas;
	}
	public Peto getPeto() {
		return peto;
	}
	public void setPeto(Peto peto) {
		this.peto = peto;
	}
	public Accesorio getAccesorio() {
		return accesorio;
	}
	public void setAccesorio(Accesorio accesorio) {
		this.accesorio = accesorio;
	}
	public Llave getLlave() {
		return llave;
	}
	public void setLlave(Llave llave) {
		this.llave = llave;
	}

	public void setPocion(Pocion pocion, int i){
		pociones[i] = pocion;
	}

	public Pocion getPocion(int i){
		return pociones[i];
	}
}