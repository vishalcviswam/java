//Program to demonstrate the addition and deletion of elements in deque

import java.util.*;
public class CO4Q14{
	public static void main(String args[])
	{
		Deque<Integer> dq = new ArrayDeque<>();
		
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("enter the size");
		int sz=obj.nextInt();
		for(int i=0;i<sz;i++)
		{
			System.out.println("enter the value through front end");
			n=obj.nextInt();
			dq.addFirst(n);
		}
		for(int i=0;i<sz;i++)
		{
			System.out.println("enter the value through last end");
			n=obj.nextInt();
			dq.addLast(n);
		}
		
		int first = dq.removeFirst();
		int last = dq.removeLast();
		System.out.println("first :"+ first +" last :"+ last);
	}
}
