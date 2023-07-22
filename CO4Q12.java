//Program to remove an object from the Stack when the position is passed as parameter

import  java.util.*;
public class CO4Q12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the Size of Stack: " );
        int n = obj.nextInt();
        for (int i =0 ; i<n;i++){
			System.out.print("Enter the elements: " );
			st.add(obj.nextInt());
		}
        System.out.println("Stack = "+st);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int x = sc.nextInt();
        st.remove(x);
        System.out.println("Stack = "+st);
    }
}