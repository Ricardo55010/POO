import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mosaico extends JFrame implements ActionListener{
	JButton btn[][];
	JLabel etiqueta;
	int contador=1;
	JPanel p1, p2;
	ImageIcon im[][];

	public Mosaico(){
		super("Mosaico");
		btn = new JButton[4][5];		
		im = new ImageIcon[4][5];
		etiqueta = new JLabel();
		p1 = new JPanel();
		p2 = new JPanel();
		p1.setLayout(new GridLayout(4,5));
		add("East",p1);
		add("West",p2);
		p2.add(etiqueta);
		for(int i=0;i<4;i++){
			for(int j=0; j<5; j++){
				btn[i][j] = new JButton(new ImageIcon("ima/"+contador+".jpg"));
				btn[i][j].addActionListener(this);
				p1.add(btn[i][j]);
				contador++;
			}
		}
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(1000,500);
		setVisible(true);
	}

	public void actionPerformed( ActionEvent e ){
		JButton aux=(JButton)e.getSource();
		etiqueta.setIcon(aux.getIcon());
	}
	
	public static void main(String s[]){
		new Mosaico();
	}
}
