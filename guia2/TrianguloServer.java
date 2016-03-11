import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
 
public class TrianguloServer extends UnicastRemoteObject implements Triangulo {
 
    public TrianguloServer() throws RemoteException {
        super();
    }
 
    public synchronized Integer calcTriangulo(int b, int h) throws RemoteException{
        return (b*h)/2;
    }
	
    public static void main(String[] args){
        try {
            TrianguloServer im = new TrianguloServer( );
            Naming.rebind(Triangulo.LOOKUPNAME, im);
            System.out.println("Servidor Listo");
        }catch(Exception e){
            System.err.println("Problema: " + e);
        }
    }
}