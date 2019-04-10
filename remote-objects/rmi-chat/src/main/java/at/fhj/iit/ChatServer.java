package at.fhj.iit;

import java.rmi.*;
import java.util.*;

public interface ChatServer extends Remote{
	public boolean login (ChatClient a)throws RemoteException ;
	public void publish (String s)throws RemoteException ;
}