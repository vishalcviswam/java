//Using generic method perform Bubble sort. 

import java.util.Scanner;
class bubble
{
int n=4;
int ar[]=new int[n];
Scanner cin=new Scanner(System.in);
void insert()
{
int i;
System.out.println("Enter the elements of array");
for(i=0;i<n;i++)
{
ar[i]=cin.nextInt();
}
}
void sort()
{
int i,j,temp;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
	if(ar[j] < ar[i])    
     {    
        temp = ar[i];    
        ar[i] = ar[j];    
        ar[j] = temp; 
	 }
}
}
}
void display()
{
	int i;
System.out.println("printing sorted array");
for(i=0;i<n;i++)
{
	System.out.println(ar[i]);
}
}
}
public class CO4Q9
{
	public static void main(String args[])
	{
		bubble b=new bubble();
		b.insert();
		b.sort();
		b.display();
	}
}
