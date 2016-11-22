import java.util.Random;

public class Combate{
	
	private Personaje heroe;
	private Personaje enemigo;
	private Random random;
	
	public Combate(Personaje heroe, Personaje enemigo) {
		this.heroe = heroe;
		this.enemigo = enemigo;
		random = new Random();
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
<<<<<<< HEAD
		boolean heroeIsAlive=true;
=======
		boolean heroIsAlive=true;
>>>>>>> ae44dc5c3b0d11a560711ce2c851712fa6920a84
		boolean turnoHeroe=true;
		boolean turnoEnemigo=false;
		while(heroe.getVida() > 0 && enemigo.getVida() > 0){
			if(turnoHeroe){
				// ¿Qué quieres hacer?
				int accionHeroe=random.nextInt(4);
					// Habilidad
						// Físico
						// Magia
					// Arma
					// Curar
				switch(accionHeroe){
					case 0: // Habilidad física
					double dhf = ((heroe.getHFisica().getFuerza())+(heroe.getFuerza()*0.5)-enemigo.getResistencia());
					int hfatk = (int) dhf;
					if(hfatk>0){
						enemigo.setVida(enemigo.getVida()-hfatk);
					}
					break;

					case 1: // Habilidad mágica
					double dhm = ((heroe.getHMagica().getMagia())+(heroe.getMagia()*0.5)-enemigo.getInteligencia());
					int hmatk = (int) dhm;
					if(hmatk>0){
						enemigo.setVida(enemigo.getVida()-hmatk);
					}
					break;

					case 2: // Arma
					int af=heroe.getBolsa().getArma().getFuerza();
					int am=heroe.getBolsa().getArma().getMagia();
					int tota=af+am;
					double dar = (af+am-(enemigo.getResistencia()*(af/tota))-(enemigo.getInteligencia()*(am/tota)));
					int aatk = (int) dar;
					if(aatk>0){
						enemigo.setVida(enemigo.getVida()-aatk);
					}
					break;

					case 3: // Curar
					// Lista de pociones
					Pocion pocionElegida; //
					// heroe.setVida(heroe.getVida()+pocionElegida.getVida());
					break;
				}
			} else {
				int accionEnemigo=random.nextInt(2);
				switch(accionEnemigo){
					case 0: // Habilidad física
					double ehf = ((enemigo.getHFisica().getFuerza())+(enemigo.getFuerza()*0.5)-heroe.getResistencia());
					int hfene = (int) ehf;
					if(hfene>0){
						heroe.setVida(heroe.getVida()-hfene);
					}
					break;

					case 1: // Habilidad mágica
					double ehm = ((enemigo.getHMagica().getMagia())+(enemigo.getMagia()*0.5)-heroe.getInteligencia());
					int hmene = (int) ehm;
					if(hmene>0){
						heroe.setVida(heroe.getVida()-hmene);
					}
					break;
				}
			}
			turnoHeroe=!turnoHeroe;
			turnoEnemigo=!turnoEnemigo;
		}
		if(heroe.getVida()>0){
			heroIsAlive=true;
			heroe.setVida(heroe.getMaxVida());
		} else {
			heroIsAlive=false;
		}
<<<<<<< HEAD
		return heroeIsAlive;
=======
		return heroIsAlive;
>>>>>>> ae44dc5c3b0d11a560711ce2c851712fa6920a84
	}
}
