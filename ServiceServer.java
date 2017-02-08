import java.rmi.*;

public interface ServiceServer extends Remote {
   Object[] getServerList() throws RemoteException;
   Service getService(Object serviceKey) throws RemoteException;
}