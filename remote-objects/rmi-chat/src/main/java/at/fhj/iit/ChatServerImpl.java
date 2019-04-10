package at.fhj.iit;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
     
public class ChatServerImpl extends UnicastRemoteObject implements ChatServer {

	// stores all clients at remote server
	private Vector clients = new Vector();

	public ChatServerImpl() throws RemoteException {
	}

	/**
	 * registers new chat client / user => subscribes user to current chat
	 * user will receive new messages
	 * @param cc
	 * @return
	 * @throws RemoteException
	 */
	public boolean login(ChatClient cc) throws RemoteException {
		System.out.println(cc.getName() + " got connected....");
		// "tells" user that connection is successful
		cc.tell("You have Connected successfully.");
		// tells other users that new client joined current chat
		publish(cc.getName() + " has just connected.");
		// adds chat client to vector list
		clients.add(cc);
		return true;
	}

	/**
	 * publishes a message to all subscribed chat clients
	 * @param msg
	 * @throws RemoteException
	 */
	public void publish(String msg) throws RemoteException {
		// for debug usage on server to test if messaging works fine
		System.out.println(msg);

		// go trough all clients
		for (int i = 0; i < clients.size(); i++) {
			try {
				ChatClient tmp = (ChatClient) clients.get(i);
				tmp.tell(msg);
			} catch (Exception e) {
				// TODO remove client at any problems (?)
				//problem with the client not connected.
				//Better to remove it
			}
		}
	}

}