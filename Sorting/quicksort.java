package question.sorting;

public class quicksort {

    // public static int pivotsort(int [] arr,int s,int e){

    //     int count=0;
    //     int pivot=arr[s];

    //     for(int i=s;i<=e;i++){
    //         if(arr[i]<pivot){
    //             count++;
    //         }
    //     }

    //             int temp1;          // putting pivot to its correct position
    //             temp1=arr[s+count];
    //             arr[s+count]=arr[s];
    //             arr[s]=temp1;
        



    //             int pivotindex=count+s;

    //     while(s<e){

    //         while(arr[s]<=pivot&&s<pivotindex){

    //             s++;
    //         }

    //         while(arr[e]>pivot&&e>pivotindex){  

    //             e--;
    //         }

    //         if(s<e){
    //             int temp;
    //             temp=arr[s];
    //             arr[s]=arr[e];
    //             arr[e]=temp;
    //         }
    //     }

                
    //             return pivotindex;

    // }

    // public static void sort(int [] arr,int s,int e){

    //     if(s<=e){

    //     int pivot=arr[s];

    //     int pos=pivotsort(arr,s,e);  // getting the position or real index of the pivot
   
    //     sort(arr, s, pos-1);

        

    //     sort(arr, pos+1, e);

        

    //     }


    
        

    // }




    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low]; // Choosing the first element as pivot
        int i = low + 1; // Start from the next element after the pivot
        int j = high;

        // Changed condition to i <= j to allow i to equal j for comparison
        while (i <= j) {
            // Find element greater than pivot
            while (i <= j && arr[i] <= pivot) {
                i++;
            }

            // Find element less than or equal to pivot
            while (j >= i && arr[j] > pivot) {
                j--;
            }

            // Swap elements if needed
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in the correct position
        arr[low] = arr[j];
        arr[j] = pivot;

        return j; // Return the position of the pivot
    }

    public static void main(String[] args) {
        
        int [] arr={24 ,18, 38, 43, 14, 40, 1 ,54};

        int s=0;
        int e=arr.length-1;

        quickSort(arr,s,e);

        for(int a:arr){
            System.out.print(a+" ");
        }

       
        
    }



}

