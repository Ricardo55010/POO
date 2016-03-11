import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 4. Codificar un applet que tenga tres campos de entrada y un botón. 
Los campos de entrada se usaran para escribir tres números y cuando se presione el botón se mostrara 
el mayor de los 3 números en  la zona de status.
*/

public class mayor extends Applet implements ActionListener{
	TextField num1,num2,num3;
	int v[];
	Button show;
	Label etiq;
	
	public void init(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(10);
		v = new int[3];
		show = new Button("Muesta");
		etiq = new Label("         ");
		add(num1); add(num2); add(num3);
		add(show); add(etiq);
		show.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		v[0] = Integer.parseInt(num1.getText());
		v[1] = Integer.parseInt(num2.getText());
		v[2] = Integer.parseInt(num3.getText());
		int c = v[0];
		for(int i=1; i<3; i++)
			if(v[i] > c)
				c = v[i];
		etiq.setText(""+c);
	}
}