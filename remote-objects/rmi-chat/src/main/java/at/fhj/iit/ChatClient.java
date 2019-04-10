package at.fhj.iit;

import java.rmi.*;
     
    public interface ChatClient extends Remote{
    	public void tell (String msg)throws RemoteException ;
    	public String getName()throws RemoteException ;
    }