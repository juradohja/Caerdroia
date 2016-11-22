public class Combate{
	
	private Personaje heroe;
	private Personaje enemigo;
	
	public Combate(Personaje heroe, Personaje enemigo) {
		this.heroe = heroe;
		this.enemigo = enemigo;
	}
	
	public Personaje getHeroe() {
		return heroe;
	}

	public void setHeroe(Personaje heroe) {
		this.heroe = heroe;
	}

	public Personaje getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Personaje enemigo) {
		this.enemigo = enemigo;
	}

/*	
	public void atacaHeroeHabilidad(){
		enemigo.setVida(enemigo.getVida-(""+heroe.getFuerza()+heroe.getMagia()-heroe.getResistencia()-heroe.getInteligencia()));
	}
	
	public void atacaHeroeArma(Personaje enemigo, Arma arma){
		enemigo.setVida(enemigo.getVida-(heroe.getFuerza()+heroe.getMagia()+arma.getFuerza()+arma.getMagia()));
	}
	
	public void atacaEnemigo(Personaje heroe){
		heroe.setVida(heroe.getVida-(enemigo.getFuerza()+enemigo.getMagia()-enemigo.getResistencia()-enemigo.getInteligencia()));
	}
*/
	public boolean entrarEnCombate(){
		boolean heroeIsAlive;
		boolean turnoHeroe=true;
		boolean turnoEnemigo=false;
		while(heroe.getVida() > 0 && enemigo.getVida() > 0){
			if(turnoHeroe){
				// ¿Qué quieres hacer?
					// Habilidad
						// Ataque
						// Defensa
					// Arma
					// Curar
			}
		}
	}
}
