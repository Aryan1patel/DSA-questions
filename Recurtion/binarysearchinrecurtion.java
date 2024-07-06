package question.recurtion;

public class binarysearchinrecurtion {


    static int findno(int [] arr,int s,int e,int key){
     
        int mid=(e+s)/2;

        if(s>e){
            return -1;
        }

         
        if(arr[mid]==key){
            return mid;
           
        }

        else if(arr[mid]>key){

           return findno(arr, s, mid-1, key);
        }
        else if (arr[mid]<key) {
            return findno(arr, mid+1, e, key);
        }
        return -1;
      


    }
    
    public static void main(String[] args) {
        
        int [] arr={1,2,3,4,5,31,32};

        int key=5;

        System.out.println(findno(arr,0,arr.length,key));
    }
}
