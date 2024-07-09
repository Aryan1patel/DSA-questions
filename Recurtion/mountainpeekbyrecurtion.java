package question.recurtion;

public class mountainpeekbyrecurtion {

    static int findpeak(int [] arr,int mid,int s,int e){

        mid=(s+e)/2;
        if(s>=e){
            return -1;
        }

        if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
            return arr[mid];
        }

        else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
        
            return findpeak(arr, mid, s=mid+1, e);
        }

        else if(arr[mid]<arr[mid-1]&&arr[mid]>arr[mid+1]){
           
            return findpeak(arr, mid, s, e=mid-1);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int [] arr={1,2,3,4,5,6,1};

        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;

        System.out.println(findpeak(arr,mid,s,e));
    }
}
