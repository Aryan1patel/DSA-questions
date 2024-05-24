public class Insertionsort {
    

    static void insert(int arr[],int i)
    {
             int no=arr[i];
           int check=0;
           
           for(int j=i-1;j>=0;j--){
  
               if(arr[j]>=no){
  
                   arr[j+1]=arr[j];
  
                   if(j==0){
                      arr[j]=no;
                   }   
               }
  
               if(no>arr[j]){
  
                   arr[j+1]=no;
                   break;
               }
               
  
             
           }
         
    }
    //Function to sort the array using insertion sort algorithm.
   public static void main(String[] args) {
    
   

    int [] arr={4, 1, 3, 9, 7};
        
        
        
        int no=1;
        
        for(int i=1;i<arr.length;i++){
            
            insert(arr,i);
            
        }

        for(int a:arr){
            System.out.print(a+" ");
        }
        
        
    }
}
