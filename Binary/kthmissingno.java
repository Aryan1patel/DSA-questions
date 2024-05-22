
//package question.binary;

public class kthmissingno {
    

    public static void main(String[] args) {
        
        int [] arr={2,3,4,7,11};

        int k=2;   // we have to find 5th missing no int the array

        int s=0;
        int e=arr.length-1;

        int mid=(s+e)/2;

        int val1=0;
        
        System.out.println(s+" "+e);

        while(s<=e){
            mid=(s+e)/2;

            

            if(arr[mid]-(mid+1)<k){     
    
                s=mid+1;
    
            }
            else{
                
                e=mid-1;
            }

            System.out.println(s+" "+e);

           
        }

        System.out.println((e+1)+k);  // just add the k in the no index(from 1 indexing)
    }


}
