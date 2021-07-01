import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Convert extends JFrame implements ActionListener{

//declaration de variables
  private JLabel l1 = new JLabel("FCFA:");
	private JLabel l2 = new JLabel("EURO:");
	private JTextField t1 = new JTextField(12);
	private JTextField t2 = new JTextField(12);
	private JButton bouton1 = new JButton("Convertir");
	private JButton bouton2 = new JButton("Annuler");




  public  Convert(){
	  	this.setTitle(" Convertisseur ");
	    this.setSize(555, 425); //taille de la fenetre
	    this.setResizable(true);// autoriser l'agrandissement
	    this.setLocationRelativeTo(null);// centrer la fenetre
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JPanel pannel = new JPanel();
	    JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
	    JPanel p1 = new JPanel();
	    p1.setBackground(new Color(255,255,212));
	    p1.setLayout(null);
	    p1.add(l1); // ajout de l1 dans p1
	    l1.setBounds(new Rectangle(20, 15, 60, 25)); // position de notre label (l1)
	    t1.setBounds(new Rectangle(20, 45, 150, 25));
	    p1.add(t1);
	    l2.setBounds(new Rectangle(255, 15, 60, 25));
	    p1.add(l2);
	    t2.setBounds(new Rectangle(250, 45, 150, 25));
	    p1.add(t2);
	    bouton1.setBounds(new Rectangle(150,150,100,28));
      //20, 75, 100, 28
	    p1.add(bouton1);
	    bouton1.addActionListener(this);
	    bouton2.addActionListener(this);
	    bouton2.setBounds(new Rectangle(300, 275, 100, 28));
	    p1.add(bouton2);
	    p1.setPreferredSize(new Dimension(450, 320));
	   onglets.addTab("DEVISE", p1);

	    pannel.add(onglets);

	    Font f1 = new Font("TimesRoman",Font.BOLD,14);
	    Font f2 = new Font("TimesRoman",Font.BOLD,16);
	    Font f3 = new Font("TimesRoman",Font.BOLD,15);
	    t1.setFont(f1);
	    t2.setFont(f1);
	    l1.setFont(f2);
	    l2.setFont(f2);

	    bouton1.setFont(f3);
	    bouton2.setFont(f3);

    this.getContentPane().add(pannel);
    this.setVisible(true);
  }


public void actionPerformed(ActionEvent e) {

	if (e.getSource()==bouton1){
		String v1 = t1.getText();
		String v3 = t2.getText();
		if (v1.length()==0 && v3.length()==0){
					JOptionPane.showMessageDialog(this, " Veuillez donner la valeur a convertir SVP !");
		}
		else {
			if (v1.length()==0 && v3.length()!=0){
			double result1 = Double.parseDouble(v3);
			double r1 = result1 * 655 ;
			String v2 = Double.toString(r1);
			t1.setText(v2);
			}
			else if (v1.length()!=0 && v3.length()==0){
				double result2 = Double.parseDouble(v1);
				double r2 = result2 / 655 ;
				String v4 = Double.toString(r2);
				t2.setText(v4);
			}
		}
	}
	if (e.getSource()==bouton2){
		t1.setText(null);
		t2.setText(null);
	}

}

public static void main(String[] args) {
    Convert c = new Convert();
  }
}
