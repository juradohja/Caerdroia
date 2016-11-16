public class Cazador extends Personaje{

	public Cazador(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel, Bolsa bolsa){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel, bolsa);
	}

	public Cazador(int nivel){
		vida = 65*nivel;
		fuerza = 16*nivel;
		magia = 7*nivel;
		resistencia = 4*nivel;
		inteligencia = 3*nivel;
		iniciativa = 10*nivel;
	}
}
