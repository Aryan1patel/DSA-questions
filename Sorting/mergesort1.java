package question.sorting;

import java.util.ArrayList;

public class mergesort1 {


    public static void merge(int [] arr,int left,int mid,int right){


        int i=left;
        int j=mid+1;

        ArrayList<Integer> temp = new ArrayList<>();


        

        while(i<=mid&&j<=right){  // mid and right are the index value so we have to use =

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

            arr[a]=temp.get(a-left);   // getting value from the temp arraylist from its indexing 0 1 2 3


        }
    }

    public static void divide(int []arr,int left,int right){

        if(left>=right){
            return;
        }
        int mid=(left+right)/2;

        

        divide(arr, left, mid);  // get left part

        divide(arr, mid+1, right);  // get right part

        merge(arr, left, mid, right);  // now merge those sorted array

    }
    

    public static void main(String[] args) {
        
        int [] arr={4,2,1,6,7,8};

        divide(arr,0,arr.length-1);

        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
