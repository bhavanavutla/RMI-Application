import java.rmi.*;
public interface StringOperations extends Remote{
	public long findStringLength(String s) throws RemoteException;
	public boolean checkPalindrome(String s) throws RemoteException;
}
