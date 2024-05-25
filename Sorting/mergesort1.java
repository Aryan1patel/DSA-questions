package question.sorting;

import java.util.ArrayList;

public class mergesort1 {


    public static void merge(int [] arr,int left,int mid,int right){


        int i=left;
        int j=mid+1;

        ArrayList<Integer> temp = new ArrayList<>();


        

        while(i<=mid&&j<=right){

            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;

            }
        }

        while(i<=mid){
            
            temp.add(arr[i]);
            i++;
        }
        while(j<=right){
            temp.add(arr[j]);
            j++;
        }

        for(int a=left;a<=right;a++){

            arr[a]=temp.get(a-left);


        }
    }

    public static void divide(int []arr,int left,int right){

        if(left>=right){
            return;
        }
        int mid=(left+right)/2;

        

        divide(arr, left, mid);

        divide(arr, mid+1, right);

        merge(arr, left, mid, right);

    }
    

    public static void main(String[] args) {
        
        int [] arr={4,2,1,6,7,8};

        divide(arr,0,arr.length-1);

        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
