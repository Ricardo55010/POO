import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
 
public class SalarioServer extends UnicastRemoteObject implements Salario {
 
    public SalarioServer() throws RemoteException {
        super();
    }
 
    public synchronized float salarioSemanal(int horas) throws RemoteException{
		//Suponiendo que el salario minimo semanal = 70.00
		if(horas <= 40)
			return horas*70;
		System.out.println(""+(horas-40)*140);
		System.out.println(""+((horas-40)*140 + 2800));
		return 2800 + ((horas-40)*140);
    }
	
    public static void main(String[] args){
        try {
            SalarioServer im = new SalarioServer( );
            Naming.rebind(Salario.LOOKUPNAME, im);
            System.out.println("Servidor Listo");
        }catch(Exception e){
            System.err.println("Problema: " + e);
        }
    }
}