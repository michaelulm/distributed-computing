package at.fhj.iit;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * simple Client for testing Remote Method Invocation
 * link: https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html
 */
public class Client {

    private Client() {}

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            // get current RMI registry
            // TODO try to use "Client" on other device than the "Server" is running
            Registry registry = LocateRegistry.getRegistry(host);
            // initialise stub object of remote skeleton
            Hello stub = (Hello) registry.lookup("Hello");
            // remote method invocation (RMI), and get response
            String response = stub.sayHello();

            response = stub.greet("Mike");

            // output current response
            // TODO Extend Method with e.g. 1-2 arguments and create other outputs, e.g. "Hello", "Good morning", ... depends on the time of the day
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}