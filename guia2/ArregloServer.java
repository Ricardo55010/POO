import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
 
public class ArregloServer extends UnicastRemoteObject implements Arreglo {
 
    public ArregloServer() throws RemoteException {
        super();
    }
	
    public synchronized Integer maximo(int v[], int l) throws RemoteException{
		int aux = v[0];
		for(int i=1; i<l; i++)
			if(aux < v[i])
				aux = v[i];
		return aux;
    }
	
	public synchronized Integer minimo(int v[], int l) throws RemoteException{
		int aux = v[0];
		for(int i=1; i<l; i++)
			if(aux > v[i])
				aux = v[i];
		return aux;
	}
	
	public synchronized float promedio(int v[], int l) throws RemoteException{
		float prom = 0;
		for(int i=0; i<l; i++)
			prom += v[i];
		prom /= l;
		return prom;
	}
	
    public static void main(String[] args){
        try {
            ArregloServer im = new ArregloServer( );
            Naming.rebind(Arreglo.LOOKUPNAME, im);
            System.out.println("Servidor Listo");
        }catch(Exception e){
            System.err.println("Problema: " + e);
        }
    }
}