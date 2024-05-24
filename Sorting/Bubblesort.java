public class Bubblesort {
    

    public static void main(String[] args) {


        int [] arr={4, 1, 3, 9, 7};
        
        
        int e=arr.length-2;
        int temp;
        
        while(0<=e){

            boolean swap= false;      // that why best time complecity of bubble is O(n)
        
        for(int i=0;i<=e;i++){
            
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

                swap=true;
            }
            
        }

        if(swap==false){
            break;
        }
        
        e--;
        
        }

        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
