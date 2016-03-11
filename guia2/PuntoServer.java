import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.lang.Math;
 
public class PuntoServer extends UnicastRemoteObject implements Punto {
 
    public PuntoServer() throws RemoteException {
        super();
    }
 
    public synchronized Integer enRadio(int x, int y) throws RemoteException{
		if( Math.sqrt( Math.pow(x,2) + Math.pow(y,2) ) <= 100 )
			return 1;
		return 0;
    }
	
    public static void main(String[] args){
        try {
            PuntoServer im = new PuntoServer( );
            Naming.rebind(Punto.LOOKUPNAME, im);
            System.out.println("Servidor Listo");
        }catch(Exception e){
            System.err.println("Problema: " + e);
        }
    }
}