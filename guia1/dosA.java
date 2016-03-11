import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 2-A. Escriba un applet que tenga dos campos de entrada y un botón  que al ser presionado compare
los contenidos de los campos y muestre si son iguales o no.
*/

public class dosA extends Applet implements ActionListener{
	TextField cad1,cad2;
	Label etiq;
	Button compare;
	
	public void init(){
		cad1 = new TextField(50);
		cad2 = new TextField(50);
		etiq = new Label("Not compared");
		compare = new Button("Comparar");
		add(cad1); add(cad2); add(compare); add(etiq);
		compare.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String aux = cad1.getText();
		String auxs = cad2.getText();
		if( aux.equals(auxs) )
			etiq.setText("Iguales");
		else
			etiq.setText("Distintas");
	}
}