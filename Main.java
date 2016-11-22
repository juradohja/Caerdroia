import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
	private JButton crear;
	private JLabel nom, tit, create, tip;
	private String[] characters = {"Alquimista","Caballero","Cazador","Necromancer"}; 
	private JComboBox personajes = new JComboBox(characters);
	private JTextField nombre;
	private String name;
	private int type;
	private Personaje p;



	public Main(){
		setTitle("Caerdroia");
		setSize(1000,1000);
		setLayout(new GridBagLayout());
		setUIFont (new javax.swing.plaf.FontUIResource("Arial",Font.PLAIN,35));
		GridBagConstraints c = new GridBagConstraints();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents(c);
		setVisible(true);
	}

	public void initComponents(GridBagConstraints c){
		crear = new JButton("Crear");
		nom = new JLabel("Nombre: ");
		tit = new JLabel("Caerdroia");
		create = new JLabel("Bienvenido, crea a tu nuevo personaje");
		tip = new JLabel("Tipo: ");
		nombre = new JTextField(12);
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 0;
		add(tit, c);
		c.gridy = 1;
		add(create, c);
		c.gridwidth = 1;
		c.gridy = 2;
		add(nom, c);
		c.gridx = 1;
		add(nombre, c);
		c.gridy = 3;
		add(personajes, c);
		c.gridy = 4;
		add(crear, c);
		crear.addActionListener(this);
		c.gridy = 3;
		c.gridx = 0;
		add(tip, c);
	}

	public void actionPerformed(ActionEvent e){
			name = nombre.getText();
			type = personajes.getSelectedIndex();
			p = createHero(name, type);
			Mapa m = new Mapa(p);
			Ventana v = new Ventana(m);
			dispose();
			System.out.println(p.getNombre());
			System.out.println(type);
		}

	public Personaje createHero(String n, int t){
		switch(t){
			case 0:
				return new Alquimista(n, 1);
			case 1:
				return new Caballero(n, 1);
			case 2:
				return new Cazador(n, 1);
			case 3:
				return new Necromancer(n, 1);
		}
		return null;
	}

	public static void setUIFont (javax.swing.plaf.FontUIResource f){
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
    	Object key = keys.nextElement();
        Object value = UIManager.get (key);
        if (value != null && value instanceof javax.swing.plaf.FontUIResource)
        	UIManager.put (key, f);
      	}
    }

	public static void main(String args[]){
		Main m = new Main();
	}
}