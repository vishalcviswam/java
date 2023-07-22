//Program to demonstrate the creation of queue object using the PriorityQueue class

import java.util.*;
class CO4Q13{
	public static void main(String args[])
	{
		PriorityQueue<Integer> priorQ = new PriorityQueue<Integer>();
		
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("enter the size");
		int sz=obj.nextInt();
		for(int i=0;i<sz;i++)
		{
			System.out.println("enter the value");
			n=obj.nextInt();
			priorQ.add(n);
		}
		
		System.out.println(priorQ.peek());
		System.out.println(priorQ);
		System.out.println(priorQ.poll());
		System.out.println(priorQ.peek());
		System.out.println(priorQ);
	}
}
