import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
Problema 3. Codificar un applet que tenga dos campos de entrada y cuatro botones.
Los campos de entrada se usaran para escribir dos números, el primer botón, para sumar, el segundo para restar, 
tercero para multiplicar y el cuarto para dividir (ver figura). 
El resultado se imprimirá en la zona de status o una etiqueta (no mostrada aquí).
*/
public class calc extends Applet implements ActionListener{
	TextField num1,num2;
	Button sum,res,mult,div;
	Label etiq;

	public void init(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		sum = new Button("Sumar");
		res = new Button("Restar");
		mult = new Button("Multiplicar");
		div = new Button("Dividir");
		etiq = new Label("*********");
		add(num1); add(num2); add(sum);
		add(res); add(mult); add(div); add(etiq);
		sum.addActionListener(this);
		sum.addActionListener(this);
		res.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		Button temp = (Button) e.getSource();
		if( temp == sum )
			etiq.setText(""+ (Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText())) );
		if( temp == res)
			etiq.setText(""+ (Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText())) );
		if( temp == mult)
			etiq.setText(""+ (Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText())) );
		if( temp == div)
			etiq.setText(""+ (Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText())) );
	}
}