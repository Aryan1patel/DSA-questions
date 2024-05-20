package question.recurtion;
import java.util.Scanner;
import java.util.ArrayList;

public class fibonachiseries {

    public static int makefibo(int n){    // finding nth element

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }


        int ans =makefibo(n-1) + makefibo(n-2);    // mean if we need 2nd element 2nd = 1st +0th  == 1+0=1 

        return ans;



    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth index:");

        int n =sc.nextInt();

        int frist=0;
        int sec=1;

        System.out.println(makefibo(n));
    }

    
}
