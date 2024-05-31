import java.util.ArrayList;
import java.util.Arrays;

public class onetwosort {
    
    public static void main(String[] args) {

        int [] arr= {0 ,1 ,1 ,0 ,0 ,1 ,1 ,0 ,1 ,0};  // for arraylist change name to arr1

        // ArrayList<Integer> arr= new ArrayList<>();

        // for(int a:arr1){
        //     arr.add(a);
        // }
        
        int mid=0;
        int s=0;
        int e=arr.length-1;

        int temp;

        while(s<=e&&mid<=e){

            if(arr[mid]==0){
                
                temp=arr[mid];
                arr[mid]=arr[s];
                arr[s]=temp;
                mid++;
                s++;

            }

          else if(arr[mid]==1){
                mid++;
                
            }
           else{
                temp=arr[mid];
                arr[mid]=arr[e];
                arr[e]=temp;
                
                e--;
            }

        

            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println("    "+s+"  and  "+e+"  with mid "+mid);

        }




        // int low = 0, mid = 0, high = arr1.length - 1; // 3 pointers

        // while (mid <= high) {
        //     if (arr.get(mid) == 0) {
        //         // swapping arr[low] and arr[mid]
        //         int temp = arr.get(low);
        //         arr.set(low, arr.get(mid));
        //         arr.set(mid, temp);

        //         low++;
        //         mid++;

        //     } else if (arr.get(mid) == 1) {
        //         mid++;

        //     } else {
        //         // swapping arr[mid] and arr[high]
        //         int temp = arr.get(mid);
        //         arr.set(mid, arr.get(high));
        //         arr.set(high, temp);

        //         high--;
        //     }

        //     System.out.println(arr+"    "+low+"  and  "+high+"  with mid "+mid);
        // }

        // System.out.println(arr);
    }
}
