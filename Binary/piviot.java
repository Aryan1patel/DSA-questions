public class piviot {
    public static void main(String[] args) {
        

        int [] arr2= {1,2,3,4,7,8,9};


        int [] arr= {7,8,9,1,2,3,4,5,6};     // it is rotated array

        int s=0;
        int e=arr.length-1;
        int piviotno;               // we taking piviot no is lower

        


        while(s<=e){

            int mid= (s+e)/2;
            
            if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){

                piviotno=arr[mid];

                System.out.println("the piviot no is "+piviotno);

                System.exit(0);
            }

            if(arr[mid]>arr[0]){                      // because it is on before line of piviot no because all no in after line in smaller that no arr[0]
                                                      // and piviot no is not greater than the frist no
                s=mid+1;
                System.out.println("s");
            }

            if(arr[mid]<arr[e]){                     // because all no in after array is smaller than the last no and in frist array all no is greater than last so only change in after array
                e=mid-1;                             // and if mid is piviot no that frist if work
                System.out.println("e");

                
            }
        }
    }
}
