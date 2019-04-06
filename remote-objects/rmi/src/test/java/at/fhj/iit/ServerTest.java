package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerTest {

	// TODO start Server before !
	private Registry registry;
	private Hello stub;

	@Before
	public void setup() throws RemoteException, NotBoundException {
		registry = LocateRegistry.getRegistry("localhost");
		stub = (Hello) registry.lookup("Hello");
	}

	@Test
	public void testSayHello() throws RemoteException, NotBoundException {
		String response = stub.sayHello();

		assertEquals(response, "Hello, World!");
	}

	@Test
	public void testGreet() throws RemoteException, NotBoundException {
		String response = stub.greet("Michael");

		assertEquals(response, "Hello Michael!");
	}
}
