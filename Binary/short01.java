
public class short01 {
    public static void main(String[] args) {
        
        int[] arr ={1,1,0,1,0,1,0,0,1,0};
        
        

        // for(int i =0;i<arr.length;i++){
        //     int temp;

        //     for(int j =0;j<arr.length;j++){

        //         if(arr[i]<arr[j]){

        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;

        //             continue;

                    
        //         }
                
        //     }



        // }

        // for(int a:arr){
        //     System.out.print(a);
        // }



        // fast method

        int i =0;
        int j=arr.length-1;

        while(i<=j){

             int temp=0;
           
            

            // if(arr[i]>arr[j]){


            //     temp=arr[i];
            //     arr[i]=arr[j];
            //     arr[j]=temp;

            //     i++;
            //     j--;

            // }

        

            // if(arr[i]>arr[i+1]){
            //     temp=arr[i];
            //     arr[i]=arr[i+1];
            //     arr[i+1]=temp;
                
            //     i++;
            // }


            // if(arr[j]<arr[j-1]){
            //     temp=arr[j];
            //     arr[j]=arr[j-1];
            //     arr[j-1]=temp;

            //     j--;
            // }

            // if(arr[i]==arr[j]){
            //     i++;
            //     j--;
            // }



            // other way

            if(arr[i]==0){
                i++;

             continue;

            }
            if(arr[j]==1){
                j--;
                
                continue;
            }
            if(arr[i]>arr[j]){

                
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              


                i++;
                j--;

                continue;
            }

        }






        for(int a:arr){
            System.out.print(a);
        }


    }
}
