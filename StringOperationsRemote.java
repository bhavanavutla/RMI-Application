import java.rmi.*;
import java.rmi.server.*;
public class StringOperationsRemote extends UnicastRemoteObject implements StringOperations
{
StringOperationsRemote() throws RemoteException
{
	super();
}
public long findStringLength(String s)
	{ 
		return s.length();
	}
public boolean checkPalindrome(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		}
		return true; 
	}
}
