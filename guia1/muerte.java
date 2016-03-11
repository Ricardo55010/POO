import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 3-A. Escriba un applet que tenga un campos de entrada y un botón  que al ser presionado
diga en que año morirá la persona, suponiendo que vivirá 77 años
*/

public class muerte extends Applet implements ActionListener{
	TextField edad;
	Label etiq;
	Button muere;
	
	public void init(){
		edad = new TextField(3);
		etiq = new Label("Inmortal");
		muere = new Button("Mostrar");
		add(edad); add(muere); add(etiq);
		muere.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		etiq.setText("" + (2015 +  (77 - Integer.parseInt(edad.getText())) ) );
	}
}