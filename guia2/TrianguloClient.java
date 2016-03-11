import java.rmi.*;
import java.util.*;
 
public class TrianguloClient {
    
	protected static Triangulo netConn = null;
	
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int b=0,h=0;
         try {
            String url = "rmi://localhost/ChatServer";
            netConn = (Triangulo) Naming.lookup(Triangulo.LOOKUPNAME);
            System.out.printf("Introduce valor de base:   "); b=Integer.parseInt(input.next());
            System.out.printf("Introduce valor de altura: "); h=Integer.parseInt(input.next());
 
            int result = netConn.calcTriangulo(b,h);
            System.out.println("\n El area del triangulo es: "+result);
        } catch (Exception e) {
            System.out.println("Exception in main: " + e);
            e.printStackTrace();
        }
    }
}

/* 
	Compilación: Compilas los 3 > Rmic > Registry > Server > Cliente 
	El server y el client van en 2 diferentes
*/