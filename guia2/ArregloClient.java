import java.rmi.*;
import java.util.*;
 
public class ArregloClient {
	protected static Arreglo con = null;
	
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		int num;
         try {
            String url = "rmi://localhost/ChatServer";
            con = (Arreglo) Naming.lookup(Arreglo.LOOKUPNAME);
            System.out.printf("Introduce el numero de numeros que vas a ingresar: "); num = Integer.parseInt(input.next());
			int[] a = new int[num];
			for(int i=0; i<num; i++){
				int aux = Integer.parseInt(input.next());
				a[i] = aux;
			}
			System.out.println("El maximo es: " + con.maximo(a,num));
			System.out.println("El minimo es: " + con.minimo(a,num));
			System.out.printf("El promedio es: %.2f\n",con.promedio(a,num));
        } catch (Exception e) {
            System.out.println("Exception in main: " + e);
            e.printStackTrace();
        }
    }
}