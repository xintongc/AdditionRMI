package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ImplementRemoteInterface.Addition;

public class Server {

	public static void main(String args[]) throws Exception
	{
		Addition obj = new Addition();
		Registry registry = LocateRegistry.createRegistry(5678);
		registry.bind("Addition", obj);
		System.out.println("Server is Up & Running");
	}
}
