package at.fhj.iit;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

// TODO start rmiregistry before !

public class Server implements Hello {
        
    public Server() {}

    /**
     * method, which will be invoked by client
     * @return
     */
    public String sayHello() {
        return "Hello, World!";
    }

    public String greet(String firstname){
        return "Hello " + firstname + "!";
    }

    public static void main(String args[]) {
        
        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // only needed if rmiregistry command not called, there are some problems
//             LocateRegistry.createRegistry(1099);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Hello", stub);

            // Server / Remote Object is ready now!
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}