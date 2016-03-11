import java.rmi.*;
 
public interface Triangulo extends Remote {
    public Integer calcTriangulo(int b, int h) throws RemoteException;
    public final static String LOOKUPNAME = "Triangulo";
}