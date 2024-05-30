public class searchinrotated {
    public int search(int[] arr, int target) {
        
        int s=0;
        int e= arr.length-1;

        int mid=(s+e)/2;

        while(s<=e){
            mid=(s+e)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>=arr[s]){
                if(target<arr[mid]&&target>=arr[s]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }

            else{
                if(target<=arr[e]&&target>arr[mid]){
                    s=mid+1;


                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
  }
 }
