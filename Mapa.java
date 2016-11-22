import java.io.Serializable;
import java.util.Random;

public class Mapa implements Serializable{
	
	private Personaje heroe;
	private Camara[][] camaras;
	private int posicionX=0;
	private int posicionY=0;
	private Random random;

	public Mapa(Personaje heroe){
		this.heroe = heroe;
		random = new Random();
		camaras = new Camara[5][5];
		initChambers();
	}

	public Personaje getHeroe() {
		return heroe;
	}

	public void setHeroe(Personaje heroe) {
		this.heroe = heroe;
	}

	public void setCamara(Camara camara, int i, int j){
		camaras[i][j] = camara;
	}

	public Camara getCamara(int i, int j){
		return camaras[i][j];
	}

	public void setPosicionX(int posicionX){
		this.posicionX = posicionX;
	}

	public int getPosicionX(){
		return posicionX;
	}

	public void setPosicionY(int posicionY){
		this.posicionY = posicionY;
	}

	public int getPosicionY(){
		return posicionY;
	}

	private void initChambers(){
	/*	int tipoEnemigo = random.nextInt(4);
		int nivelEnemigo = 1;
		int tipoEquipo = random.nextInt(5);
		int tipoPocion = random.nextInt(3);
		int llave = 0;
		int up = 0;
		int down = 2;
		int left = 0;
		int right = 0;
		String acertijo;
		String respuesta;
		int nivel = 1;
	*/
		camaras[0][0]=new Camara(random.nextInt(4), 1, random.nextInt(5), random.nextInt(3), 0, 0, 2, 0, 0, "", "", 1);
		camaras[0][1]=new Camara(random.nextInt(4), 1, random.nextInt(5), random.nextInt(3), 0, 2, 2, 0, 0, "Canta sin voz, vuela sin alas, sin dientes muerde, sin boca habla.", "viento", 2);
		camaras[0][2]=new Camara(random.nextInt(4), 1, random.nextInt(5), random.nextInt(3), 0, 2, 0, 0, 2, "Las raices no se ven, y es mas alta que un arbol. Arriba y arrriba sube; y sin embargo no crece.", "montana", 3);
		camaras[1][2]=new Camara(random.nextInt(4), 1, random.nextInt(5), random.nextInt(3), 0, 2, 1, 2, 0, "Que es algo y nada a la vez?", "pez", 4);
		camaras[1][1]=new Camara(random.nextInt(4), 1, random.nextInt(5), random.nextInt(3), 0, 2, 2, 0, 0, "Vive de dia, pero muere de noche.", "sol", 5);
		camaras[1][0]=new Camara(random.nextInt(4), 2, random.nextInt(5), random.nextInt(3), 7, 0, 2, 0, 0, "Dejo de existir si pronuncias mi nombre.", "silencio", 6);
		camaras[1][3]=new Camara(random.nextInt(4), 2, random.nextInt(5), random.nextInt(3), 0, 2, 0, 2, 0, "Es tuyo pero todos lo usan mas que tu.", "nombre", 7);
		camaras[0][3]=new Camara(random.nextInt(4), 2, random.nextInt(5), random.nextInt(3), 0, 0, 2, 0, 2, "Caja blanca sin llave, tapa o bisagra, pero dentro un tesoro dorado guarda.", "huevo", 8);
		camaras[0][4]=new Camara(random.nextInt(4), 2, random.nextInt(5), random.nextInt(3), 0, 2, 0, 0, 2, "Tengo agujas y no se coser, tengo numeros y no se contar.", "reloj", 9);
		camaras[1][4]=new Camara(random.nextInt(4), 2, random.nextInt(5), random.nextInt(3), 0, 0, 0, 2, 2, "Sin ser arbol tengo hojas, sin ser bestia un buen lomo, y mi nombre en cada lomo esta.", "libro", 10);
		camaras[2][4]=new Camara(random.nextInt(4), 3, random.nextInt(5), random.nextInt(3), 0, 1, 0, 2, 2, "Aunque sea tan pequeño siempre separo y siempre detengo.", "punto", 11);
		camaras[3][4]=new Camara(random.nextInt(4), 3, random.nextInt(5), random.nextInt(3), 13, 0, 0, 2, 0, "Tiene dientes y no come, tiene cabeza y no es hombre.", "ajo", 12);
		camaras[2][3]=new Camara(random.nextInt(4), 3, random.nextInt(5), random.nextInt(3), 0, 2, 2, 0, 0, "Viste de un chaleco blanco y tambien negro de frac es algo que no vuela, pero sabe nadar.", "pinguino", 13);
		camaras[2][2]=new Camara(random.nextInt(4), 3, random.nextInt(5), random.nextInt(3), 0, 2, 2, 0, 0, "Donde hay rios pero no agua, hay ciudades pero no edificios, hay bosques pero no arboles?", "mapa", 14);
		camaras[2][1]=new Camara(random.nextInt(4), 3, random.nextInt(5), random.nextInt(3), 0, 2, 2, 0, 0, "Hoyos por debajo, izquierda y derecha, y aun asi sostiene agua con toda sus fuerzas.", "esponja", 15);
		camaras[2][0]=new Camara(random.nextInt(4), 4, random.nextInt(5), random.nextInt(3), 0, 0, 2, 0, 2, "Va a traves de ciudades y sobre colinas pero nunca se mueve.", "carretera", 16);
		camaras[3][0]=new Camara(random.nextInt(4), 4, random.nextInt(5), random.nextInt(3), 0, 0, 0, 2, 2, "No ha sido, pero va a ser y cuando sea ya no lo sera.", "manana", 17);
		camaras[4][0]=new Camara(random.nextInt(4), 4, random.nextInt(5), random.nextInt(3), 0, 0, 2, 2, 0, "Que es lo que quitas y crece?", "hoyo", 18);
		camaras[4][1]=new Camara(random.nextInt(4), 4, random.nextInt(5), random.nextInt(3), 0, 2, 2, 1, 0, "Si me conoces me querras compartir, pero si me compartes desaparecere.", "secreto", 19);
		camaras[4][2]=new Camara(random.nextInt(4), 4, random.nextInt(5), random.nextInt(3), 21, 2, 0, 0, 0, "Que es lo que se sostiene y no se rompe?", "promesa", 20);
		camaras[3][1]=new Camara(random.nextInt(4), 5, random.nextInt(5), random.nextInt(3), 0, 0, 2, 0, 2, "Devora todas las cosas: aves, bestias, plantas y flores; roe el hierro, muerde el acero, mata reyes, arruina ciudades y derriba las altas montañas.", "tiempo", 21);
		camaras[3][2]=new Camara(random.nextInt(4), 5, random.nextInt(5), random.nextInt(3), 0, 2, 2, 0, 0, "Se compra para comer pero no se come.", "cubierto", 22);
		camaras[3][3]=new Camara(random.nextInt(4), 5, random.nextInt(5), random.nextInt(3), 0, 2, 0, 0, 2, "Dorado como el oro pero plata no es.", "platano", 23);
		camaras[4][3]=new Camara(random.nextInt(4), 5, random.nextInt(5), random.nextInt(3), 0, 0, 2, 2, 0, "Cual es la estrella que no brilla?", "estrella de mar", 24);
		camaras[4][4]=new Camara(4, 10, random.nextInt(5), random.nextInt(3), 0, 2, 0, 0, 0, "???????????????", "iugytrdsedttgyhijhgtydryghijhugft", 25);
	}
}