public class Main{
	public static void main(String args[]){
		Personaje heroe = new Personaje("Betosh", 100, 1000, 2000, 10, 9999, 2, 100, 1);
		Mapa mapa = new Mapa(heroe);
		Ventana v = new Ventana(mapa); 
	}
}