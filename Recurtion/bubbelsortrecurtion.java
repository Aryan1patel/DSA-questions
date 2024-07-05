import java.util.ArrayList;

public class bubbelsortrecurtion {

    static ArrayList arl =new ArrayList<>();
    
    static int temp;

    static ArrayList sortit(int [] arr, int n){

        if(n==0||n==1){
            for(int a:arr){
                arl.add(a);
            }
            return arl;
        }

        for(int i=0 ;i<=n-1;i++){
            if(arr[i]>arr[i+1]){
                
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        return sortit(arr, n-1);
    } 
    public static void main(String[] args) {
        
        int [] arr={2,3,52,4,1,7,6,88};

        int n=arr.length-1;

        System.out.println(sortit(arr,n));
    }
}
