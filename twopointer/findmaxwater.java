package twopointer;

public class findmaxwater {
    public int maxArea(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;

        int max=-999999;
        int water;
        

        while(s<=e){
            mid=(s+e)/2;

            if(arr[s]>arr[e]){
                
                water=arr[e]*(e-s);
                e--;
                
            }
            else{
                
                water=arr[s]*(e-s);
                s++;
                
            }

            if(water>max){
                max=water;
            }




        }
        return max;
    }
}
