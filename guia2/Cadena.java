import java.rmi.*;
 
public interface Cadena extends Remote {
    public String aMayusculas(String cad) throws RemoteException;
	public Integer largo(String cad) throws RemoteException;
    public final static String LOOKUPNAME = "Cadena";
}