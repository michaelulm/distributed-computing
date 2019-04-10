package at.fhj.iit;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// TODO before starting server:
// start rmiregistry -J-Djava.class.path="D:\Data\Checkouts\DistributedComputing\RMI_Chat\out\production\RMI_Chat"

    public class StartServer {
		public static void main(String[] args) {
			try {

				// defines host and port
				String host = "localhost";
//				String host = "xxx.xxx.xxx.xxx";
				String name = "IITchat";
				Integer port = 1099;

				System.getProperties().setProperty("java.rmi.server.hostname",host);
				System.getProperties().setProperty("java.rmi.activation.port", port.toString());

				// only needed if rmiregistry command not called, there are some problems
//				java.rmi.registry.LocateRegistry.createRegistry(1099);

				// initialise ChatServer Implementation
				ChatServer cs = new ChatServerImpl();
				Registry registry = LocateRegistry.getRegistry(host, port);
				registry.rebind(name, cs);

				// also possible instead of above lines to (re)bind RMI Registry
				// Naming.rebind("rmi://"+host+"/"+name+", b);

				System.out.println("[System] Chat Server is ready.");
			} catch (Exception e) {
				System.out.println("Chat Server failed: " + e);
			}
		}
	}