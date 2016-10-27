public class Camara{

	private Personaje enemigo;
	private Equipo equipo;
	private Pocion pocion;
	private Llave llave;
	private int up;
	private int down;
	private int left;
	private int right;
	private String acertijo;
	private String respuesta;
	private int nivel;
	
	public Camara(Personaje enemigo, Equipo equipo, Pocion pocion, Llave llave, int up, int down, int left, int right,
			String acertijo, String respuesta, int nivel) {
		this.enemigo = enemigo;
		this.equipo = equipo;
		this.pocion = pocion;
		this.llave = llave;
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
		this.acertijo = acertijo;
		this.respuesta = respuesta;
		this.nivel = nivel;
	}

	public Personaje getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Personaje enemigo) {
		this.enemigo = enemigo;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Pocion getPocion() {
		return pocion;
	}

	public void setPocion(Pocion pocion) {
		this.pocion = pocion;
	}

	public Llave getLlave() {
		return llave;
	}

	public void setLlave(Llave llave) {
		this.llave = llave;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public String getAcertijo() {
		return acertijo;
	}

	public void setAcertijo(String acertijo) {
		this.acertijo = acertijo;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}