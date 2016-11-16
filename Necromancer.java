public class Necromancer extends Personaje{

	public Necromancer(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel, Bolsa bolsa){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel, bolsa);
	}
	
	public Necromancer(int nivel){
		vida = 75*nivel;
		fuerza = 7*nivel;
		magia = 16*nivel;
		resistencia = 3*nivel;
		inteligencia = 4*nivel;
		iniciativa = 8*nivel;
	}
}
