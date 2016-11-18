public class Alquimista extends Personaje{

	public Alquimista(String nombre, int vida, int fuerza, int magia, int resistencia, int inteligencia, int iniciativa,
		int experiencia, int nivel, Bolsa bolsa){
		super(nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa,
		experiencia, nivel, bolsa);
	}

	public Alquimista(int nivel){
		super(nivel);
		inteligencia = inteligencia*3;
		// Terminar, hacer lo mismo para el resto de los personajes
		// Clase Personaje
	}

}