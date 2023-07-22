/*Define 2 classes; one for generating multiplication table of 5 and other for displaying first 
N prime numbers. Implement using threads. (Thread class) */

import java.util.*;

class MulTable extends Thread
{
	public void run()
	{
		int num=5;
		System.out.println("THE MULTIPLICATION TABLE::");
		for(int i=0;i<=10;i++)
		{
			System.out.printf("%d * %d=%d\n",num,i,num*i);
		}
	}
}

class PrimeNo extends Thread
{
	public void run()
	{
		int i,j,flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("first N prime numbers");
		System.out.println("enter the limt :");
		int N=sc.nextInt();
		System.out.println("the prime numbers between 1 and"+N+"are");
		for(i=1;i<=N;i++)
		{
			if(i==1 || i==0)
			
				continue;
				flag = 1;
			
				for(j=2;j<=i/2;++j)
				{
					if(i%j==0)
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println(i+" ");
				}
				
			}
			
		}
}
	

public class CO4Q5
{
	public static void main(String[] args) throws InterruptedException
	{
		MulTable a=new MulTable();
		a.start();
		a.sleep(2000);
		PrimeNo b=new PrimeNo();
		b.start();
		b.sleep(200);
	}
}
