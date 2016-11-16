public class Alquimista extends Personaje{

	public Alquimista(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel, Bolsa bolsa){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel, bolsa);
	}

	public Alquimista(int nivel){
		vida = 85*nivel;
		fuerza = 10*nivel;
		magia = 12*nivel;
		resistencia = 4*nivel;
		inteligencia = 5*nivel;
		iniciativa = 6*nivel;
	}
}
