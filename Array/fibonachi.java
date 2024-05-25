package question.array;

public class fibonachi {

    public static int fibo(int []arr,int n){


        for(int i=2;i<n;i++){
            arr[i]=arr[i-2]+arr[i-1];
            

         
        }

        int no=arr[n-1]+arr[n-2];

        return no;
    }
    
    public static void main(String[] args) {

        int n=4;
        
        int [] arr= new int[n];

        arr[0]=0;
        arr[1]=1;

     

       

        

        System.out.println(fibo(arr, n));

        
        
    }

    
}
