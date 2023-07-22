//Program to create a generic stack and do the Push and Pop operations. 

import java.util.*;
 
class arrayStack
{
    public int arr[];
    public int top, size, len;
    
    public arrayStack(int n)
    {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == size -1 ;        
    }
    public int peek()
    {
        return arr[top];
    }
    public void push(int k)
    {
        if(top + 1 >= size)
			System.out.println(" overflow ");
        if(top + 1 < size )
            arr[++top] = k;
    }
    public int pop()
    {
        if( isEmpty() )
			System.out.println(" underflow ");
        return arr[top--]; 
    }    
    public void display()
    {
        System.out.print("\nStack = ");
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
}
public class CO4Q8
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);        
        System.out.println("Enter Size of the Stack ");
        int n = obj.nextInt();
      
        arrayStack stk = new arrayStack(n);
       
        int ch = 7;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            int choice = obj.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
				stk.push( obj.nextInt() );                         
                break;                         
            case 2 : 
                  System.out.println("Popped Element = " + stk.pop());
                   
                break;                         
            case 3 :         
				  System.out.println("Peek Element = " + stk.peek());
                break;                         
            case 4 : 
                System.out.println("Empty status = " + stk.isEmpty());
                break;                
            case 5 :
                System.out.println("Full status = " + stk.isFull());
                break;                                          
            default : 
                System.out.println("enter valid option \n ");
                break;
            }
        } while (ch != 0);                 
    }
}
