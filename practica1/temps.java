import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class temps extends Applet implements ActionListener{
	Button botonCK,botonKC;
	TextField texto;
	Label etiq;
	
	public void init(){
		botonCK = new Button("C° to K°");
		botonKC = new Button("K° to C°");
		texto = new TextField(4);
		etiq = new Label("invalid");
		add(texto); add(botonCK); add(botonKC); add(etiq);
		botonCK.addActionListener(this);
		botonKC.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		Button temp = (Button) e.getSource();
		if( temp == botonCK )
			etiq.setText("" + (Float.parseFloat(texto.getText()) + 273.15) );
					
		if( temp == botonKC )
			etiq.setText("" + (Float.parseFloat(texto.getText()) - 273.15) );
	}
	
}

