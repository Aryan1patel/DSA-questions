

public class piviotbyrecurtion {
    

    static int findpiviot(int [] arr,int mid,int s,int e){

        if(s>=e){
            return -1;
        }

        mid=(s+e)/2;

       
        if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){

            return arr[mid];
            
            
        }
        else if(arr[mid]>arr[s]){
            return findpiviot(arr, mid, mid+1, e);

        }
        else if(arr[mid]<arr[e]){
           return findpiviot(arr, mid, s, mid-1);
          
        }
        return -1;

     

        

    }

    public static void main(String[] args) {
        
        int [] arr ={6,7,8,9,11,1,2,3,4};

        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;

        System.out.println(findpiviot(arr,mid,s,e));

    }
}
