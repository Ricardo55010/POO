import java.rmi.*;
 
public interface Salario extends Remote {
    public float salarioSemanal(int h) throws RemoteException;
    public final static String LOOKUPNAME = "Salario";
}