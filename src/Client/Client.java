package Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import ServerInterface.AddInterface;

public class Client {

	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int a,b,n;
	
		Registry registry = LocateRegistry.getRegistry(5678);
		AddInterface obj = (AddInterface) registry.lookup("Addition");
		
		System.out.print("Enter a number: ");
		a=sc.nextInt();
		System.out.print("Enter a number: ");
		b=sc.nextInt();
		
		n = obj.add(a, b);
		System.out.println("Addition is : " + n);
	}
}
