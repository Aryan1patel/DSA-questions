package question.recurtion;

public class sumno {

  

    static int addi(int [] arr,int a){

        if(a==arr.length){
            return 0;
        }
        else{
           
          
            return arr[a]+addi(arr, a+1);

        }

        // if(a<=0){
        //     return 0;
        // }

        // return arr[a-1]+addi(arr, a-1);
    }
    
    public static void main(String[] args) {
        
        int [] arr={1,2,3,4,5};

        int ans= addi(arr,0);  // both work but we have to change second input in funciton in frist it is 0 and in second it is arr.length

        System.out.println(ans);

    }
}
