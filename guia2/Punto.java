import java.rmi.*;
 
public interface Punto extends Remote {
    public Integer enRadio(int b, int h) throws RemoteException;
    public final static String LOOKUPNAME = "Punto";
}