
package question.recurtion;

import java.util.Scanner;


public class numbersprint {

    static void printno(int n){

        if(n==0){
            return ;

        }

        

        printno(n-1);                     // this is head recursion because this is above code

        System.out.println(n);       // head and tail recurtinon happen reverse

                                    // because like in this case frist printno function executed to the end when n==0 then passing the value of the function to old function and then the old function run comptely and lower line run and again move to old function
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int n= sc.nextInt();

        printno(n);
    }
}
