package question.recurtion;
import java.util.ArrayList;

public class mergesorthh {
    


    
    static void merge(int [] arr,int s,int e,int mid){

  

       int len1=mid-s+1;
       int len2= e-mid;


       int [] arr1= new int[len1];
       int [] arr2 = new int[len2];

       for (int i = 0; i < len1; ++i)
			arr1[i] = arr[s + i];

          
		for (int j = 0; j < len2; ++j)
			arr2[j] = arr[mid + 1 + j];

   

       int i=0;
       int j=0;


       int mainindex=0;

       while(i<arr1.length&&j<arr2.length){

           if(arr1[i]<arr2[j]){
               arr[mainindex++]=arr1[i++];
           }
           else{
               arr[mainindex++]=arr2[j++];

           }
       }

       while(i<arr1.length){
           
           arr[mainindex++]=arr1[i++];
       }
       while(j<arr2.length){
           arr[mainindex++]=arr2[j++];
       }

    }



    

    static void sortarray(int [] arr,int s,int e){

        

    if(s<e){

     int mid=(s+e)/2;
    
        
     sortarray(arr, s, mid);

     

     sortarray(arr, mid+1, e);

     merge(arr, s, e,mid);

     

    }

    }


    static void printarr(int [] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    

    public static void main(String[] args) {
        
        int [] arr={4,6,9,1,2,3};


        sortarray(arr, 0, arr.length-1);

        printarr(arr);
    }
}
