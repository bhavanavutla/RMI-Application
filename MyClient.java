// Import required packages
import java.rmi.*;
import java.io.*;
import java.util.*;
public class MyClient{
public static void main(String args[])
{
try
{
StringOperations stub = (StringOperations)Naming.lookup("rmi://localhost/rmiapp");
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String s=sc.next();
System.out.println("The length of string is "+stub.findStringLength(s));
if(stub.checkPalindrome(s)){
	System.out.println("The given string is a palindrome");
}
else{
	System.out.println("The given string is not a palindrome");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}  	
