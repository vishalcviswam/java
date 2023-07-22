/*Maintain a list of Strings using ArrayList from collection framework, perform built-in 
operations.*/


import java.util.*;

public class CO4Q10
{
	public static void main(String args[])
	{
		ArrayList<String> newlist=new ArrayList<String>();
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the size of the array :");
		int sz= obj.nextInt();
		String item;
		for(int i=0;i<sz;i++)
		{
			System.out.println("enter the array elements in string :");
			item=obj.next();
			newlist.add(item);
		}
		
		System.out.println("the array elemnts are :"+newlist);
	}
}
