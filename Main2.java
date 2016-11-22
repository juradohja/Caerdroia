import java.util.Scanner;

public class Main2{
	public static void main(String[] args){
		Personaje h = new Necromancer("heroe", 1);
		Personaje e = new Cazador("enemigo",1);
		Scanner sc = new Scanner(System.in);

		h.setNombre("Luis");
		e.setNombre("e");
		System.out.println("Ha aparecido un "+e.getNombre()+" ¿Quieres atacar? Si [s]   No [n]");
		String respuesta = sc.nextLine();
		if (respuesta.equals("s")){
			while(e.getVida()>0&&h.getVida()>0){
				h.atacarHeroeHabilidad(e);
				if(e.getVida()>0){
					e.atacarEnemigo(h);
				}
				else{
					System.out.println("Haz vencido");
				}
			}
		}
	}
}