import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class test extends Applet implements ActionListener{
	int [][] m;
	Button [][] botons;
	Button show;
	int c;
	
	public void init(){
		c=1;
		m = new int[4][11];
		botons = new Button[4][11];
		for(int i=0; i<4; i++)
			for(int j=0; j<11; j++){
				m[i][j] = 1;
				botons[i][j] = new Button(""+c);
				botons[i][j].addActionListener(this);
				add(botons[i][j]);
				c++;
			}
		show = new Button("Reservados");
		show.addActionListener(this);
		add(show);
	}
	
	public void actionPerformed(ActionEvent e){
		Button temp = (Button)e.getSource();
		for(int i=0; i<4; i++)
			for(int j=0; j<11; j++){
			   System.out.println(""+i+" "+j);
					Button act = botons[i][j];
					if(temp == act)
						m[i][j] = 0;
				}
		if(temp == show){
			for(int i=0,c=0; i<4; i++,c+=11)
				for(int j=0; j<11; c++,j++)
					if(m[i][j] == 1)
						botons[i][j].setLabel("-");
		}			
	}
	
}

