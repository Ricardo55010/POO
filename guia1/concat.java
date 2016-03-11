import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 2. Escriba un applet que tenga dos campos de entrada y un botón  que al ser presionado concatene
los contenidos de los campos y muestre la concatenación en la zona de status.
*/

public class concat extends Applet implements ActionListener{
	TextField cad1,cad2;
	Label etiq;
	Button union;
	
	public void init(){
		cad1 = new TextField(50);
		cad2 = new TextField(50);
		etiq = new Label("Not united yet");
		union = new Button("Concatenar");
		add(cad1); add(cad2); add(union); add(etiq);
		union.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		etiq.setText(cad1.getText()+cad2.getText());
	}
}