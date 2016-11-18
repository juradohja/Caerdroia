public class Caballero extends Personaje{

	public Caballero(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel, Bolsa bolsa){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel, bolsa);
	}
	
	public Caballero(int nivel){
		vida = 100*nivel;
		fuerza = 12*nivel;
		magia = 10*nivel;
		resistencia = 5*nivel;
		inteligencia = 4*nivel;
		iniciativa = 5*nivel;
	}
}
