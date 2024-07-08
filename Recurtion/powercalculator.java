public class powercalculator {
    
    static int getpower(int a,int b){

        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }

        int ans=getpower(a, b/2);  // define ans

        if(b%2==0){
            return ans*ans;   // mean a power b/2 *a power b/2
        }
        else{
            return a*ans*ans;
        }

    }

    public static void main(String[] args) {
        
        int a=2;
        int b=5;

        System.out.println(getpower(a,b));
    }
}
