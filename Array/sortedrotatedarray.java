public class sortedrotatedarray {
    public static void main(String[] args) {
        
        int [] arr={6,7,8,1,2,3};

        int changecount=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>arr[(i+1)%arr.length]){   // this is change part were the array meet its piviot we take % because we also have to know that
                                                // is last element is greater then 1st element thats also wronge case because the 1st element has to be greater than last element

                changecount++;
            }
            if(changecount==2){
                System.out.println("it is not a sorted and rotated array");
                break;
            }

            
        }

        if(changecount==1){
            System.out.println("it is a sorted and rotated array");
        }
    }
}
