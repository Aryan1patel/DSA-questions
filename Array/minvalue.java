package question.array;

public class minvalue {
    
    public static void main(String[] args) {
        
        int [] arr={11,13,15,17};  // can be rotated sorted array

        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;

        int max;
        int min;

        if(arr[s]>arr[e]){
            max=arr[s];
            min=arr[e];
        }
        else{
            max=arr[e];
            min=arr[s];
        }


       int minno=999999;

        while(s<=e){

            if(arr[mid]<min){
                minno=arr[mid];
            }

            mid=(s+e)/2;



            if(arr[mid]>max){
                s=mid+1;
                
            }
            else if(arr[mid]<min){
                e=mid-1;
            }
        }

        System.out.println(min);

        
    }
}

