public class Main{
	public static void main(String args[]){
		Personaje heroe = new Caballero("Betosh", 1);
		Mapa mapa = new Mapa(heroe);
		Ventana v = new Ventana(mapa);
	}
}