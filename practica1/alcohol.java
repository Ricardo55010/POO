import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class alcohol extends Applet implements ActionListener{
	Button boton;
	TextField texto;
	Label etiq;
	
	public void init(){
		boton = new Button("Mandalo");
		texto = new TextField(4);
		etiq = new Label("invalid");
		add(texto); add(boton); add(etiq);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		etiq.setText(""+(2015 - Integer.parseInt(texto.getText())));
	}
	
}

