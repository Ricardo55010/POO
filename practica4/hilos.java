import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class hilos extends Applet implements ActionListener{
	String cad;
	Button boton,recorrer,nuevo;
	TextField texto;
	int moves;
	
	public void init(){
	   cad = "La practica del profe consiste en mover un texto, pero sin moverlo. LOL";
	   boton = new Button("Move it");	
	   recorrer = new Button("Move it all");
	   nuevo = new Button("Do it again");
	   texto = new TextField(cad.length());
	   add(texto); add(boton); add(recorrer); add(nuevo);
	   texto.setText(cad);
	   boton.addActionListener(this);
	   recorrer.addActionListener(this);
	   nuevo.addActionListener(this);
	   moves = 0;
	}
	
	public void actionPerformed(ActionEvent e){
		Button temp = (Button) e.getSource();
		if( temp == boton){
			char aux = cad.charAt(0);
			//System.out.println("La letra: "+aux);
			StringBuffer buf = new StringBuffer(cad.length() -1);
			buf.append(cad.substring(0, 0)).append(cad.substring(0+1));
			cad = buf.toString(); 
			//System.out.println(cad);
			cad += aux;
			texto.setText(cad);
			moves++;
		}
		if(	temp == recorrer)
			for(int i=0; i<cad.length(); i++)
				for(int j=0; j<10000000; j++)
				    if(j == 9999999){
						char aux = cad.charAt(0);
						StringBuffer buf = new StringBuffer(cad.length() -1);
			   			buf.append(cad.substring(0, 0)).append(cad.substring(0+1));
			   			cad = buf.toString(); 
						cad += aux;
						texto.setText(cad);	
					}
		if( temp == nuevo ){
			for(int i=0; i<cad.length() - moves; i++)
				for(int j=0; j<1000000; j++)
				    if(j == 999999){
						char aux = cad.charAt(0);
						StringBuffer buf = new StringBuffer(cad.length() -1);
			   			buf.append(cad.substring(0, 0)).append(cad.substring(0+1));
			   			cad = buf.toString(); 
						cad += aux;
						texto.setText(cad);	
					}
			moves = 0;
		}
	}
}
