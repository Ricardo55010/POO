import java.rmi.*;
import java.util.*;
 
public class CadenaClient {
	protected static Cadena con = null;
	
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		String cad;
         try {
            String url = "rmi://localhost/ChatServer";
            con = (Cadena) Naming.lookup(Cadena.LOOKUPNAME);
            System.out.printf("Introduce la cadena: "); cad = input.nextLine();
			System.out.println("La cadena convertida queda de la forma: " + con.aMayusculas(cad));
			System.out.println("El largo de laa cadena es: " + con.largo(cad));
        } catch (Exception e) {
            System.out.println("Exception in main: " + e);
            e.printStackTrace();
        }
    }
}