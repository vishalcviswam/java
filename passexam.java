import java.util.*;

class passwordexception extends Exception
{
	public passwordexception(String msg)
	{
		super(msg);
	}
}

public class passexam
{
	public static void main(String [] args)
	{
		Scanner obj=new Scanner(System.in);
		String password;
		
		System.out.println("enter password (the password must contain one uppercase letter, one lowercase letter,one digit,one special charcter and not less than 8 charcters) :");
		password=obj.next();
		
		try
		{
			if(password.length()<=8)
			{
				throw new passwordexception("<Warning>the password should have 8 or more charcters");
			}
			if(!password.matches(".*\\d.*"))
			{
				throw new passwordexception("<Warning>the password should contain numerical values");
			}
			if(!password.matches(".*[A-Z].*"))
			{
				throw new passwordexception("<Warning>the password should contain uppercase charcter");
			}
			if(!password.matches(".*[a-z].*"))
			{
				throw new passwordexception("<Warning>the password should contain lowercase character");
			}
			if(!password.matches(".*[!@#$%].*"))
			{
				throw new passwordexception("<Warning>the password should contain special character");
			}
		}
		catch(passwordexception e)
		{
			System.out.println(e.getMessage());
		}
	}
}