package question.recurtion;

public class quiclshotmm {



    static int particion(int [] arr,int s,int e){
        
        int count=0;

        if(s>=e){
            return count;
        }
        
        for(int i=1;i<arr.length;i++){
           if(arr[i]<arr[s]){
               count++;
           }
        }

       int temp=0;

       temp=arr[s];
       arr[s]=arr[s+count];
       arr[s+count]=temp;

       return count;

    }

    static void quicksort(int [] arr,int s,int e){
        

        if(s>=e){
            return;
        }

        int p=particion(arr,s,e);

        quicksort(arr, s, p);

        quicksort(arr, p, e);

        

    }





    static void printarr(int [] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }


    
    public static void main(String[] args) {
        
        int [] arr={5,4,2,7,1,9,8};

        int s=0;
        int e=arr.length-1;

        int mid=(s+e)/2;


        quicksort(arr, s, e);


 
    }
}
