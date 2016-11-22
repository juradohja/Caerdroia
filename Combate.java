import java.io.Serializable;
import java.util.Random;
import javax.swing.JOptionPane;

public class Combate implements Serializable{
	
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

	public Personaje entrarEnCombate(){
		boolean turnoHeroe=true;
		boolean turnoEnemigo=false;
		while(heroe.getVida() > 0 && enemigo.getVida() > 0){
			if(turnoHeroe){
				System.out.println("Turno héroe");
				String hf = heroe.getHFisica().getNombre();
				String hm = heroe.getHMagica().getNombre();
				String ar = "Usar "+heroe.getBolsa().getArma().getNombre();
				String sa = "Sanar";
				// ¿Qué quieres hacer?
				String[] accionHeroeOpciones = {"HF", "HM", "A", "S"};
				Object aH=JOptionPane.showInputDialog(null, "Es tu turno, ¿qué quieres hacer? HF: "+hf+". HM: "+hm+". A: "+ar+". S: "+sa+".", null, JOptionPane.INFORMATION_MESSAGE, null, accionHeroeOpciones, accionHeroeOpciones[0]);
				String accionHeroe = (String) aH;
					// Habilidad
						// Físico
						// Magia
					// Arma
					// Curar
				switch(accionHeroe){
					case "HF": // Habilidad física
					double dhf = ((heroe.getHFisica().getFuerza())+(heroe.getFuerza()*0.5)-enemigo.getResistencia());
					int hfatk = (int) dhf;
					if(hfatk>0){
						enemigo.setVida(enemigo.getVida()-hfatk);
						if(enemigo.getVida()>0){
							JOptionPane.showMessageDialog(null, "Has bajado "+hfatk+ " PV al enemigo. Le quedan "+enemigo.getVida()+" PV.");
						} else {
							JOptionPane.showMessageDialog(null, "Has bajado "+hfatk+ " PV al enemigo. ¡El enemigo ha sido vencido!");
						}
					}
					break;

					case "HM": // Habilidad mágica
					double dhm = ((heroe.getHMagica().getMagia())+(heroe.getMagia()*0.5)-enemigo.getInteligencia());
					int hmatk = (int) dhm;
					if(hmatk>0){
						enemigo.setVida(enemigo.getVida()-hmatk);
						if(enemigo.getVida()>0){
							JOptionPane.showMessageDialog(null, "Has bajado "+hmatk+ " PV al enemigo. Le quedan "+enemigo.getVida()+" PV.");
						} else {
							JOptionPane.showMessageDialog(null, "Has bajado "+hmatk+ " PV al enemigo. ¡El enemigo ha sido vencido!");
						}
					}
					break;

					case "A": // Arma
					int af=heroe.getBolsa().getArma().getFuerza();
					int am=heroe.getBolsa().getArma().getMagia();
					int tota=af+am;
					double dar = (af+am-(enemigo.getResistencia()*(af/tota))-(enemigo.getInteligencia()*(am/tota)));
					int aatk = (int) dar;
					if(aatk>0){
						enemigo.setVida(enemigo.getVida()-aatk);
					}
					break;

					case "S": // Curar
					// Lista de pociones
					int pocionElegida = 0; //
					try {
      					heroe.setVida(heroe.getVida()+heroe.getBolsa().getPocion(pocionElegida).getVida());
      					if(pocionElegida < 4){
      						for(int i = pocionElegida; i<4; i++){
      							heroe.getBolsa().setPocion(heroe.getBolsa().getPocion(i+1), i);
      						}
      					}
      					heroe.getBolsa().setPocion(new Pocion(3), 4);
      					heroe.getBolsa().setNumeroPociones(heroe.getBolsa().getNumeroPociones()-1);
      					if(pocionElegida < 4){
							for(int i = pocionElegida; i<4; i++){
								heroe.getBolsa().setPocion(heroe.getBolsa().getPocion(i+1), i);
							}
						}
      				} catch (NullPointerException e){
      					// No tienes pociones
      					JOptionPane.showMessageDialog(null, "No tienes pociones");
      				}
					break;
				}
			} else {
				System.out.println("Turno enemigo");
				int accionEnemigo=random.nextInt(2);
				switch(accionEnemigo){
					case 0: // Habilidad física
					double ehf = ((enemigo.getHFisica().getFuerza())+(enemigo.getFuerza()*0.5)-heroe.getResistencia()-(0.4*(heroe.getBolsa().getBotas().getResistencia()+heroe.getBolsa().getCasco().getResistencia()+heroe.getBolsa().getPeto().getResistencia())));
					int hfene = (int) ehf;
					if(hfene>0){
						heroe.setVida(heroe.getVida()-hfene);
					}
					break;

					case 1: // Habilidad mágica
					double ehm = ((enemigo.getHMagica().getMagia())+(enemigo.getMagia()*0.5)-heroe.getInteligencia()-(0.4*(heroe.getBolsa().getBotas().getInteligencia()+heroe.getBolsa().getCasco().getInteligencia()+heroe.getBolsa().getPeto().getInteligencia())));
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
		return heroe;
	}
}
