import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class edad extends Applet  implements ActionListener
{
Button calcular;
Label edad;
TextField entrada;
int calculo=0;
public void init()
{
	calcular = new Button("CALCULAR");
	edad = new Label("     ");
	entrada = new TextField(5);
	add(entrada);
	add(calcular);
	add(edad);
	calcular.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
  calculo = 2015 - Integer.parseInt(entrada.getText());
	edad.setText(""+calculo);
}
}




