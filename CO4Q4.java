/*Find the average of N positive integers, raising a user defined exception for each negative 
input. */

import java.util.Scanner;
class nIntExcep extends Exception{
    public nIntExcep(String str){
             super(str);     
    }
}
public class CO4Q4{
    public static void main(String[] args){
        Scanner Snr=new Scanner(System.in);
        int arr[];
        int sz, total=0, avg, count=0;
        System.out.print("Enter the limit: ");
        sz = Snr.nextInt();
        arr = new int[sz];
        for(int i=0;i<sz;i++)
        {
            System.out.print("Enter the value: ");
            int val = Snr.nextInt();
            arr[i] = val;
        }
        try {
            for(int i=0;i<sz;i++) {
                if(arr[i]<0){
                    throw new nIntExcep("Numbers must be positive");
                }
                else{
                    total += arr[i];
                    count++;
                }
            }
            avg=total/count;
            System.out.println("Average :"+avg);
        }
        catch(nIntExcep e){
            System.out.println(":: An Exception Occurred :: "+ e);
       }  
    }
}
