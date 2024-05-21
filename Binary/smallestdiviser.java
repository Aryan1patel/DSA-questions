package question.binary;

public class smallestdiviser {
    
    public static int gettotal(int no,int [] arr){

        int count=0;

        System.out.println(no);



        for(int i=0;i<arr.length;i++){
            
            if(arr[i]%no==0){         // if perfectly divide than add the result to count
                count+=(arr[i]/no);
                System.out.print((arr[i]/no)+" ");
            }
            else{
                count+=(arr[i]/no)+1;   // get the nearest round off max no
                System.out.print((arr[i]/no)+1+" ");
            }
        }
        System.out.println();

        return count;
    }
    public static void main(String[] args) {
        
     int [] arr={1,2,5,9};
     int limit=6;
        

        int s=1;

        int max=0;

        for(int i=0;i<arr.length;i++ ){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int e=max;

        int mid=(s+e)/2;

        int ans=0;


        while(s<=e){

            mid=(s+e)/2;

            int total=gettotal(mid,arr);

            if(total>limit){
                s=mid+1;
            }
            else if(total<=limit){
                e=mid-1;

                ans=mid;

                System.out.println("ans");

            }
        }

        System.out.println(ans);

    }


        

}
