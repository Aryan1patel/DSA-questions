package question.array;

public class productexceptself {
    

    public static void main(String[] args) {

        int [] arr= {1,2,3,4};
        
        int [] ans= new int[arr.length];

        

        for(int i=0,temp=1;i<arr.length;i++){   // storing the left side of mult of the specipic no then in below add right side of mult no
            ans[i]=temp;
            temp*=arr[i];
        }

        for(int i=arr.length-1,temp=1;i>=0;i--){
            ans[i]*=temp;
            temp*=arr[i];
        }

        for(int a:ans){
            System.out.print(a+" ");
        }
    }
}
