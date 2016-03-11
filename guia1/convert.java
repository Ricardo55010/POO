import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 1. Codificar un applet que tenga dos botones y dos campos de entrada como se muestra en la figura.
Si el usuario presiona el primer botón la cantidad en el primer campo de entradas se convertirá a dolares y
si se presiona el segundo dicha cantidad se convierte a pesos. El segundo campo se usa para meter el factor de conversión.
*/

public class convert extends Applet implements ActionListener{
	Button dolares,pesos;
	TextField cant,conv;
	float aux,auxs;
	
	public void init(){
		pesos = new Button("D to P");
		dolares = new Button("P to D");
		cant = new TextField(20);
		conv = new TextField(20);
		add(cant); add(dolares); add(pesos); add(conv);
		dolares.addActionListener(this);
		pesos.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		Button temp = (Button) e.getSource();
		if( temp == dolares){
			aux = Float.parseFloat(cant.getText());
			auxs = Float.parseFloat(conv.getText());
			cant.setText(""+aux*auxs);
		}
		if( temp == pesos){
			aux = Float.parseFloat(cant.getText());
			auxs = Float.parseFloat(conv.getText());
			cant.setText(""+aux/auxs);
		}
	}
}