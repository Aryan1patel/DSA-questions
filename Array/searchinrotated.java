package question.array;

public class searchinrotated {
    

    public static void main(String[] args) {
        
        int [] arr={4,5,6,7,0,1,2};

        int target=4;

        int s=0;
        int e= arr.length-1;

        int mid=(s+e)/2;

        while(s<=e){

            mid=(s+e)/2;

            System.out.println("hh");

            if(arr[mid]==target){
                System.out.println(mid);
            }

            if(target>arr[mid]){
                
                if(target>arr[s]){
                    s=mid+1;
                }
                if(arr[mid]<arr[e]){
                    e=mid-1;

                }
            }
            else{   // arr[mid]>target

                if(arr[s]<target){
                    e=mid-1;
                }
                if(target<arr[s]){
                    s=mid+1;
                }
            }
        }

       

        System.out.println(mid);;
    }
}
