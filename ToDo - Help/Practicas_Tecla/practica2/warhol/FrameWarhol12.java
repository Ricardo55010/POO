import javax.swing.*;
import java.awt.image.*;
import java.awt.*; 
import javax.imageio.*;
import java.io.*;
public class FrameWarhol12 {
   private BufferedImage buffImage;
   private JLabel jl;
   private int elec[]={ 1, 4, 5, 13, 28, 35};
   public FrameWarhol12() {
      setUpJFrame();
   }
   private void setUpJFrame() {
      JFrame myFrame = new JFrame("Warhol");
      try {
	 buffImage  = ImageIO.read(new File("mk.png")); 
      } catch (IOException e){
	 e.printStackTrace();
      }
      myFrame.setSize(buffImage.getWidth()+30, 
                      buffImage.getHeight()+30);  
      ImageIcon imaicon= new ImageIcon(posterizer(buffImage, elec[1]));
      jl=new JLabel(imaicon); 
      JScrollPane pane = new JScrollPane (jl);
      myFrame.getContentPane().add(pane);
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);    
   } 
   public static void main(String[] args) { 
      new FrameWarhol12(); 
   }
   public BufferedImage posterizer(BufferedImage  image, int num) {
      int width = image.getWidth();
      int height = image.getHeight();
      BufferedImage bufferedImage = new BufferedImage(width, height,
      BufferedImage.TYPE_INT_RGB);
      for (int j = 0; j < width; j++) {
    	 for (int k = 0; k < height; k++) {
            int pixel = image.getRGB(j, k);
    	    bufferedImage.setRGB(j, k, posterize(pixel, num));
    	 }
      }
      return bufferedImage;
   }
   private static int posterize(int x, int factor) {
      int modulo = 10;
      while (x % (modulo * 10) != x) {
         modulo *= 10;
      }
      return modulo * factor * -1;
   }
}