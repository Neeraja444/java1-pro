import java.util.*;
import java.util.Scanner;
public class LoginMain
{
public static void main(String[]args)
{
String Password = "123";
String Username = "wisdom";

Scanner input1=new Scanner(System.in);
System.out.println("Enter Username: ");
String username = input1.next();

Scanner input2=new Scanner(System.in);
System.out.println("Enter Password: ");
String password = input2.next();
if(username.equals(Username)&& password.equals(password))
{
	System.out.println("Access Granted!Welcome!");
}
else if(Username.equals(Username))
{
	System.out.println("Invaild password!");
}
else if(password.equals(password))
{
	System.out.println("Invaild Username!");
}
else
{
	System.out.println("Invalid Username&password!");
}
}
}