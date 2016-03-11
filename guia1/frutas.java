import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 5.  Codificar un applet que tenga tres botones y una etiqueta, y que si se presiona un botón 
entonces se muestre el texto que esta dentro del botón (Manzana, Limón o Naranja) en la etiqueta.
*/

public class frutas extends Applet implements ActionListener{
	Label etiq;
	Button man,lim,nar;
	
	public void init(){
		etiq = new Label("            ");
		man = new Button("Manzana");
		lim = new Button("Limon");
		nar = new Button("Naranja");
		add(man); add(lim); add(nar); add(etiq); 
		man.addActionListener(this);
		lim.addActionListener(this);
		nar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		Button temp = (Button) e.getSource();
		if( temp == man)
			etiq.setText("Manzana");
		if( temp == lim)
			etiq.setText("Limon");
		if( temp == nar)
			etiq.setText("Naranja");
	}
}