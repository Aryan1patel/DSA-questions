public class shorting012 {
    public static void main(String[] args) {
        
        int [] arr ={0,1,1,0,1,0,1,1};

       
        int mid=0;
        int j=0;
        int i=arr.length-1;
        int temp;

        while(mid<=i){
            if(arr[mid]>arr[i]){

                temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                mid++;
                i--;
                
            }
            else{
                mid++;
                i--;
            }

            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println(" ");
        }


      

            for(int a:arr){
                System.out.print(a);
            }

        }

        
    }

