package ImplementRemoteInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import ServerInterface.AddInterface;

public class Addition extends UnicastRemoteObject implements AddInterface{
	
	public Addition() throws RemoteException{
		super();
	}
	
	public int add(int x, int y)
	{
		return x+y;
	}
}
