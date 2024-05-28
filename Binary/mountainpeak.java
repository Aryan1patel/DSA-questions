public class mountainpeak {


    public int peak(int [] arr1){

        int topno=0;       // because if we not initilise then show error in method return
        int s=0;
        int e=arr1.length-1;


        while(s<=e){

            int mid=(s+e)/2;

            if(arr1[mid]>arr1[mid+1]&&arr1[mid-1]<arr1[mid]){    // this is the peak value where both lower and upper index value is lower the the peak value

                topno=arr1[mid];

                break;
            }
            if(arr1[mid]<=arr1[mid+1]){        // this is the area of increasing mountain
                s=mid+1;                       // equal because if equal also plus to go ahed

            }
            if(arr1[mid-1]>arr1[mid]){        // this is the area of decreasing mountain
                e=mid-1;                   // and if we put equal in this also 
                                           // problem like 5,4,2,2,2,2,2,1,0  if mid end in mid 2 here then both side are equal to 2 which side to move

            }

            if(arr1[mid]==arr1[mid+1]&&arr1[mid-1]==arr1[mid]){
               System.out.println("----do not repeat single no twice \n----here the no is "+arr1[mid]);

               System.exit(0);
            }


        }

        return topno;
    }
    public static void main(String[] args) {
        

        int []arr={1,2,3,5,2,1};   // here 4 is mountain peak were 1,2,3 is increasin and 2,1 is decreasin

        mountainpeak nn =new mountainpeak();

        System.out.println(nn.peak(arr));

    }
}
