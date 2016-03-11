import java.awt.*;
import javax.swing.*;
 
public class segs extends JFrame implements Runnable {
 
    Thread thread;
    JLabel segundos = new JLabel("00", SwingConstants.CENTER);
 
    public segs(){
        super("10 Segundos...");
        setSize(290, 110); setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(segundos);
		thread= new Thread(this);
        thread.start();
    }

    public void run(){
        for(int i=1; i<11; i++){
            segundos.setText(""+i);
            try{
                thread.sleep(1000);
            }catch (Exception e){}
        }
    }
 
    public static void main(String[] args){
        segs s = new segs();
    }
}