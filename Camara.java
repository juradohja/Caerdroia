// Paredes
// 0 - Pared
// 1 - Cerrado
// 2 - Abierto

import java.io.Serializable;
import java.util.Random;
import javax.swing.JOptionPane;

public class Camara implements Serializable{

	private Personaje enemigo;
	private String claseEnemigo;
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
	private Random random;
	private boolean entered;
	private int tipoEquipo;
	
	public Camara(int tipoEnemigo, int nivelEnemigo, int tipoEquipo, int tipoPocion, int claveLlave, int up, int down, int left, int right, String acertijo, String respuesta, int nivel) {
		setEnemigo(tipoEnemigo, nivelEnemigo);
		setEquipo(tipoEquipo);
		setPocion(tipoPocion);
		setLlave(claveLlave);
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
		this.acertijo = acertijo;
		this.respuesta = respuesta;
		this.nivel = nivel;
		if(nivel==1){
			entered = true;
		} else {
			entered = false;
		}	
		random = new Random();
	}

	public Personaje getEnemigo() {
		return enemigo;
	}

	private void setEnemigo(int tipoEnemigo, int nivelEnemigo) {
		switch(tipoEnemigo){
			case 0:
			enemigo = new Alquimista(nivelEnemigo);
			claseEnemigo = "Alquimista";
			break;

			case 1:
			enemigo = new Caballero(nivelEnemigo);
			claseEnemigo = "Caballero";
			break;

			case 2:
			enemigo = new Cazador(nivelEnemigo);
			claseEnemigo = "Cazador";
			break;

			case 3:
			enemigo = new Necromancer(nivelEnemigo);
			claseEnemigo = "Necromancer";
			break;

			case 4:
			enemigo = new Jefe(nivelEnemigo);
			claseEnemigo = "Jefe";
			break;
		}
	}

	public Equipo getEquipo() {
		return equipo;
	}

	private void setEquipo(int tipoEquipo) {
		switch(tipoEquipo){
			case 0:
			equipo = new Accesorio(false);
			break;

			case 1:
			equipo = new Arma(false);
			break;

			case 2:
			equipo = new Botas(false);
			break;

			case 3:
			equipo = new Casco(false);
			break;

			case 4:
			equipo = new Peto(false);
			break;
		}
		this.tipoEquipo = tipoEquipo;
	}

	public Pocion getPocion() {
		return pocion;
	}

	private void setPocion(int tipoPocion) {
		pocion = new Pocion(tipoPocion);
	}

	public Llave getLlave() {
		return llave;
	}

	private void setLlave(int claveLlave) {
		llave = new Llave(claveLlave);
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

	private void setAcertijo(String acertijo) {
		this.acertijo = acertijo;
	}

	public String getRespuesta() {
		return respuesta;
	}

	private void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public int getNivel() {
		return nivel;
	}

	private void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getClaseEnemigo(){
		return claseEnemigo;
	}

	public boolean isEntered(){
		return entered;
	}

	public Personaje iniciarCombate(Personaje heroe, Personaje enemigo){
		Combate combate = new Combate(heroe, enemigo);
		Personaje afterHeroe = combate.entrarEnCombate();
		return afterHeroe;
	}

	public Personaje cicloCamara(Personaje heroe){
		Personaje afterHeroe = heroe;
		if(!entered){
			// Mostrar acertijo
			String[] acertijoValues = {"Aceptar"};
			String res = JOptionPane.showInputDialog(null, acertijo);
			if(res.equals(respuesta)){
				// Felicidades
				JOptionPane.showMessageDialog(null, "Felicidades! Has acertado");
				afterHeroe.setFuerza(heroe.getFuerza()+random.nextInt(8));
				afterHeroe.setMagia(heroe.getMagia()+random.nextInt(8));
				afterHeroe.setResistencia(heroe.getResistencia()+random.nextInt(6));
				afterHeroe.setInteligencia(heroe.getInteligencia()+random.nextInt(6));
				afterHeroe.setMaxVida(heroe.getMaxVida()+random.nextInt(16));
				afterHeroe.setVida(heroe.getMaxVida());
				entered = true;
			} else {
				// Respuesta incorrecta
				JOptionPane.showMessageDialog(null, "Estas tonto, ahora lucharas con un "+claseEnemigo+ " nivel "+enemigo.getNivel());
				afterHeroe = iniciarCombate(heroe, enemigo);
			}
			if(afterHeroe.getVida()>0){
				JOptionPane.showMessageDialog(null, "Has ganado el combate, tus atributos han aumentado.");
				afterHeroe.setFuerza(heroe.getFuerza()+random.nextInt(8));
				afterHeroe.setMagia(heroe.getMagia()+random.nextInt(8));
				afterHeroe.setResistencia(heroe.getResistencia()+random.nextInt(6));
				afterHeroe.setInteligencia(heroe.getInteligencia()+random.nextInt(6));
				afterHeroe.setMaxVida(heroe.getMaxVida()+random.nextInt(16));
				afterHeroe.setVida(heroe.getMaxVida());
				String[] equipoOpciones = {"Aceptar", "Rechazar"};
				Object eO=JOptionPane.showInputDialog(null, "Has encontrado: "+equipo.getNombre()+". Deseas cambiarlo? (Perderas el objeto correspondiente)", null, JOptionPane.INFORMATION_MESSAGE, null, equipoOpciones, equipoOpciones[0]);
				String decisionEquipo = (String) eO;
				boolean hasAcceptedEquipo;
				if(decisionEquipo.equals("Aceptar")){
					hasAcceptedEquipo = true;
				} else {
					hasAcceptedEquipo = false;
				}
				if(hasAcceptedEquipo){
					switch(tipoEquipo){
						case 0:
						Accesorio acc = (Accesorio) equipo;
						afterHeroe.getBolsa().setAccesorio(acc);
						break;

						case 1:
						Arma arm = (Arma) equipo;
						afterHeroe.getBolsa().setArma(arm);
						break;

						case 2:
						Botas bot = (Botas) equipo;
						afterHeroe.getBolsa().setBotas(bot);
						break;

						case 3:
						Casco cas = (Casco) equipo;
						afterHeroe.getBolsa().setCasco(cas);
						break;

						case 4:
						Peto pet = (Peto) equipo;
						afterHeroe.getBolsa().setPeto(pet);
						break;
					}
				}
				if(afterHeroe.getBolsa().getNumeroPociones()<5){
					JOptionPane.showMessageDialog(null, "Has recibido una "+pocion.getNombre()+".");
					afterHeroe.getBolsa().setPocion(pocion, afterHeroe.getBolsa().getNumeroPociones());
					afterHeroe.getBolsa().setNumeroPociones(afterHeroe.getBolsa().getNumeroPociones()+1);
				} else {
					JOptionPane.showMessageDialog(null, "Has encontrado una "+pocion.getNombre()+". Lastima que no quepa en tu bolsa.");
				}
				if(llave.getNivel()!=0){
					JOptionPane.showMessageDialog(null, "Has encontrado la llave #"+llave.getNivel()+"!");
					afterHeroe.getBolsa().getLlave().setNivel(llave.getNivel());
				}
			}
			entered=true;
		}
		if(nivel==25){
			JOptionPane.showMessageDialog(null, "Felicidades! Has ganado Caerdroia! Gracias por jugar.");
		}
		return afterHeroe;
	}

}