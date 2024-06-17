public class pigeonhole {
    public static void main(String[] args) {
        

        int [] arr= new int[4];  

        int noofpigeon=2;

      

        for(int i=0;i<=noofpigeon;i++){
            
            

            if(i==arr.length-1){

                for(int j=i;j<=noofpigeon;j++){
                    arr[i]+=j;
                }
                break;
            }

            arr[i]=i;
            
        }

        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
