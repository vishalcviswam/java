//Write a user defined exception class to authenticate the user name and password.

import java.util.*;
 
class UsernameException extends Exception {
 
 public UsernameException(String msg) {
  super(msg);
 }
}
 
class PasswordException extends Exception {
 
 public PasswordException(String msg) {
  super(msg);
 }
}
 
public class CO4Q3 {
 
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password;
  
  System.out.print("Enter username : ");
  username = s.nextLine();
  
  System.out.print("Enter password : ");
  password = s.nextLine();
  
  int length = username.length();
  
  try {
   if(length < 6)
    throw new UsernameException("Username must be greater than 6 characters......");
   else if(!password.equals("qwerty"))
    throw new PasswordException("Incorrect password\nType correct password.......");
   else
    System.out.println("Login Successful !!!");
  }
  catch (UsernameException u) {
   u.printStackTrace();
  }
  catch (PasswordException p) {
   p.printStackTrace();
  }
  finally {
   System.out.println("The final statement");
  }
 }
}
