import java.util.ArrayList;
import java.util.Collections;




public class permutationofstringsort {


    static void swap(int a,int b,char [] arr){

        char temp=' ';
        temp=arr[a];
        arr[a]=arr[b]; 
        arr[b]=temp;
    }




   static void makeitper(char [] arr,int index,ArrayList<String> ans){


    
    if(index>=arr.length-1){

        ans.add(String.valueOf(arr));

        return;
    }


    for(int i=index;i<=arr.length-1;i++){

        swap(index, i,arr);  // in frist case a swap with a

        makeitper(arr, index+1,ans);  // now it goes ans add ("abc ") in ans arraylist and now work on "bc " of abc

        swap(index, i, arr);  // placing all element in there original place because now to swap a in abc with b in original string


    }







    }
    
    public static void main(String[] args) {
        
         String str= "abc";

         ArrayList<String> ans= new ArrayList<>();

        int index=0;

        makeitper(str.toCharArray(),index,ans);

        System.out.println(ans);
    }
}
