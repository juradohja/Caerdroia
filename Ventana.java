import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener{
	private int x, y, t, l, b, r;
	private MatteBorder border;
	private JPanel botones, mapa, datos, info;
	private JButton up, down, left, right;
	private JLabel nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa, experiencia, nivel, bolsa, informacion;
	private Mapa m;

	public Ventana(Mapa m){
		this.m = m;
		x = m.getPosicionX();
		y = m.getPosicionY();
		setTitle("Caerdroia");
		setSize(2000,2000);
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}

	public void initComponents(){
		mapa = new JPanel();
		mapa.setLayout(new GridLayout(5,5));
		drawMap(mapa);
		add(mapa);
		datos = new JPanel();
		datos.setLayout(new GridLayout(10,1));
		drawInfo(datos);
		add(datos);
		botones = new JPanel();
		botones.setLayout(new GridLayout(2,2));
		up = new JButton("Up");
		down = new JButton("Down");
		left = new JButton("Left");
		right = new JButton("Right");
		up.setActionCommand("up");
		down.setActionCommand("down");
		left.setActionCommand("left");
		right.setActionCommand("right");
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		botones.add(up);
		botones.add(down);
		botones.add(left);
		botones.add(right);
		add(botones);
		info = new JPanel();
		informacion = new JLabel("Caerdroia © 2016");
		info.add(informacion);
		add(info);
	}

	public void drawInfo(JPanel datos){
		nombre = new JLabel("Nombre: "+m.getHeroe().getNombre());
		vida = new JLabel("Vida: "+m.getHeroe().getVida());
		fuerza = new JLabel("Fuerza: "+m.getHeroe().getFuerza());
		magia = new JLabel("Magia: "+m.getHeroe().getMagia());
		resistencia = new JLabel("Resistencia: "+m.getHeroe().getResistencia());
		inteligencia = new JLabel("Inteligencia: "+m.getHeroe().getInteligencia());
		iniciativa = new JLabel("Iniciativa: "+m.getHeroe().getIniciativa());
		experiencia = new JLabel("Experiencia: "+m.getHeroe().getExperiencia());		
		nivel = new JLabel("Nivel: "+m.getHeroe().getNivel());
		bolsa = new JLabel("Bolsa: "+m.getHeroe().getBolsa());
		datos.add(nombre);
		datos.add(vida);
		datos.add(fuerza);
		datos.add(magia);
		datos.add(resistencia);
		datos.add(inteligencia);
		datos.add(iniciativa);
		datos.add(experiencia);
		datos.add(nivel);
		datos.add(bolsa);
	}

	public void drawMap(JPanel mapa){
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				JLabel celda = new JLabel();
				celda.setHorizontalAlignment(JLabel.CENTER);
				if(i==x && y==j){
					celda.setText("Héroe");
				}else{
					if(m.getCamara(i,j).isEntered() == true){
						celda.setText("Despejado");
					}else{
						celda.setText(" ");
					}
				}
				t =	changeNumber(m.getCamara(i,j).getUp());
				l =	changeNumber(m.getCamara(i,j).getLeft());
				b =	changeNumber(m.getCamara(i,j).getDown());
				r =	changeNumber(m.getCamara(i,j).getRight());
				border = BorderFactory.createMatteBorder(t,l,b,r, new Color(165,42,42));			
				celda.setBorder(border);
				mapa.add(celda);
			}
		}
	}

	 public int changeNumber(int num){
	 	switch(num){
	 		case 0:
	 			return 4;
	 		case 1:
	 			return 2;
	 		case 2:
	 			return 0;
	 	}
	 	return 0;
	 }

	 public void actionPerformed(ActionEvent e){
	 	String wall = e.getActionCommand();
	 	boolean move = false;
	 	int w;
	 	switch(wall){
	 		case "up":
	 			w = m.getCamara(x,y).getUp();
	 			move = validateMove(w);
	 			if (move == true){
	 				y--;
	 				m.setPosicionY(y);
	 				System.out.println(x+","+y);
	 			}
	 			break;
	 		case "down":
	 			w = m.getCamara(x,y).getDown();
	 			move = validateMove(w);
	 			if (move == true){
	 				y++;
	 				m.setPosicionY(y);
	 				System.out.println(x+","+y);
	 			}
	 			break;
	 		case "left":
	 			w = m.getCamara(x,y).getLeft();
	 			move = validateMove(w);
	 			if (move == true){
	 				x--;
	 				m.setPosicionX(x);
	 				System.out.println(x+","+y);
	 			}
	 			break;
	 		case "right":
	 			w = m.getCamara(x,y).getRight();
	 			move = validateMove(w);
	 			if (move == true){
	 				x++;
	 				m.setPosicionX(x);
	 				System.out.println(x+","+y);
	 			}
	 			break;
	 	}
	 }

	 public boolean validateMove(int w){
	 	switch(w){
	 		case 0:
	 			System.out.println("Es una pared wey");
	 			return false;
	 		case 1:
	 			System.out.println("Tienes que saltar el muro");
	 			return false;
	 		case 2:
	 			System.out.println("Pasales");
	 			return true;
	 	}
	 	return  false;
	 }
}