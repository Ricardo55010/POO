import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
 
public class CadenaServer extends UnicastRemoteObject implements Cadena {
 
    public CadenaServer() throws RemoteException {
        super();
    }
 
    public synchronized String aMayusculas(String cad) throws RemoteException{
		return cad.toUpperCase();
    }
	
	public synchronized Integer largo(String cad) throws RemoteException{
		return cad.length();
	}
	
    public static void main(String[] args){
        try {
            CadenaServer im = new CadenaServer( );
            Naming.rebind(Cadena.LOOKUPNAME, im);
            System.out.println("Servidor Listo");
        }catch(Exception e){
            System.err.println("Problema: " + e);
        }
    }
}