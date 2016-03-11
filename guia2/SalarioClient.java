import java.rmi.*;
import java.util.*;
 
public class SalarioClient {
	protected static Salario con = null;
	
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int horas;
         try {
            String url = "rmi://localhost/ChatServer";
            con = (Salario) Naming.lookup(Salario.LOOKUPNAME);
            System.out.printf("Introduce el numero de horas trabajadas: "); horas = Integer.parseInt(input.next());
			System.out.printf("El salario semanal correspondiente es: %.2f\n",con.salarioSemanal(horas));
        } catch (Exception e) {
            System.out.println("Exception in main: " + e);
            e.printStackTrace();
        }
    }
}