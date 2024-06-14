package question.array;

public class leftatkpos {
    

    public static void main(String[] args) {

        int [] arr= {1,2,3,4,5};

        int [] ans= new int[arr.length];
        int k=2;
        
        for(int i=0;i<arr.length;i++){


            if(i+k<arr.length){

               ans[i]=arr[i+k];
            }

            else{
 
                
                ans[i]=arr[arr.length-i-1];
            }
       

 
         }

         for(int a:ans){
            System.out.print(a+" ");
         }
    }
}
