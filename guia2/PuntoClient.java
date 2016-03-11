import java.rmi.*;
import java.util.*;
 
public class PuntoClient {
	protected static Punto con = null;
	
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x=0,y=0;
         try {
            String url = "rmi://localhost/ChatServer";
            con = (Punto) Naming.lookup(Punto.LOOKUPNAME);
            System.out.printf("Introduce el valor de X: "); x = Integer.parseInt(input.next());
            System.out.printf("Introduce el valor de Y: "); y = Integer.parseInt(input.next());
			if(con.enRadio(x,y) == 1)
				System.out.println("El punto esta dentro del circulo ");
			else
				System.out.println("El punto esta fuera del circulo ");
        } catch (Exception e) {
            System.out.println("Exception in main: " + e);
            e.printStackTrace();
        }
    }
}