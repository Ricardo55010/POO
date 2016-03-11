import java.rmi.*;
import java.util.*;
 
public interface Arreglo extends Remote {
    public Integer maximo(int[] v, int l) throws RemoteException;
	public Integer minimo(int[] v, int l) throws RemoteException;
	public float promedio(int[] v, int l) throws RemoteException;
    public final static String LOOKUPNAME = "Arreglo";
}