import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 6. Codificar un applet que tenga una etiqueta y dos botones. Si se presiona un botón que el numero en la 
etiqueta se incremente en una unidad y si  presiona el otro botón   que el numero en la etiqueta se decremente en una unidad. 
*/

public class updown extends Applet implements ActionListener{
	Label etiq;
	Button mas,menos;
	int c;
	
	public void init(){
		c = 0;
		etiq = new Label("    ");
		mas = new Button("+");
		menos = new Button("-");
		add(etiq); add(mas); add(menos);
		mas.addActionListener(this);
		menos.addActionListener(this);
		etiq.setText(""+c);
	}
	public void actionPerformed(ActionEvent e){
		Button temp = (Button) e.getSource();
		if( temp == mas) c++;
		else c--;
		etiq.setText(""+c);
	}
}