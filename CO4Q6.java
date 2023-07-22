/*Define 2 classes; one for generating Fibonacci numbers and other for displaying even 
numbers in a given range. Implement using threads. (Runnable Interface)*/
import java.util.*;
class fibonacci implements Runnable
{
	public void run()
	{
		int first=0,second=1,next;
		Scanner sc=new Scanner(System.in);
		System.out.println("THE FIBONACCI SERIES");
		System.out.println("enter the total number of terms");
		int n=sc.nextInt();
		System.out.println("THE GENERATED SERIES ::");
		for(int i=0;i<=n;++i)
		{
			System.out.println(first+" ");
			next=first+second;
			first=second;
			second=next;
		}
	}
} 

class evenNo implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int lower,upper;
		System.out.println("THE EVEN NUMBERS");
		System.out.println("enter the lower limit");
		lower=sc.nextInt();
		System.out.println("enter the upper limit");
		upper=sc.nextInt();
		System.out.println("the even numbers from"+lower+"and"+upper+"are");
		for(int i=lower;i<=upper;i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			else
			{
				System.out.println(i+" ");
			}
		}
	}
}

public class CO4Q6
{
	public static void main(String[] args)throws InterruptedException
	{
		fibonacci obj1=new fibonacci();
		Thread a=new Thread(obj1);
		a.start();
		a.sleep(2000);
		evenNo obj2=new evenNo();
		Thread b=new Thread(obj2);
		b.start();
		b.sleep(1000);
	}
}
