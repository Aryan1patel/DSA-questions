
public class duplicateno {
    public static void main(String[] args) {
        

        int [] arr ={1,2,3,4,3};

        for(int i =0;i<arr.length;i++){

            int a=1;

            for(int j=0;j<arr.length;j++){

                a =arr[i]^arr[j];

                
            }

            if (a==0){
                    System.out.println("the duplicate no is : "+arr[i]);
                    System.exit(0);
                }
        }
    }
}
