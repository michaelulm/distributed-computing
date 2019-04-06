package at.fhj.iit;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * simple remote interface for using RMI remote object
 */
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
    String greet(String firstname) throws RemoteException;
}