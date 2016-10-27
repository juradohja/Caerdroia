public class Bolsa{
	Arma arma;
	Casco casco;
	Botas botas;
	Peto peto;
	Accesorio accesorio;
	Llave llave;
	Pocion[5] pociones;

	public Bolsa(Arma arma, Casco casco, Botas botas, Peto peto, Accesorio accesorio, Llave llave) {
		this.arma = arma;
		this.casco = casco;
		this.botas = botas;
		this.peto = peto;
		this.accesorio = accesorio;
		this.llave = llave;
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