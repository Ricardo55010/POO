import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 2.5. Escriba un applet que tenga un campo de entrada donde el usuario escribirá
una edad y un botón  que al ser presionado muestre en la zona de status si la persona que
tiene esa edad  es mayor o menor de edad.
*/

public class edad extends Applet implements ActionListener{
	TextField edad;
	Button show;
	Label etiq;
	
	public void init(){
		edad = new TextField(3);
		show = new Button("Muestra");
		etiq = new Label("Invalido         ");
		add(edad); add(show); add(etiq);
		show.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if( Integer.parseInt(edad.getText()) >= 18)
			etiq.setText("Mayor de edad");
		else
			etiq.setText("Menor de edad");
	}
}