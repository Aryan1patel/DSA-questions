package question.recurtion;

public class climbstairs {

    public static int no=0;

    public static int totalways(int n){

        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int ans= totalways(n-1) + totalways(n-2);

        return ans;

        


    }
    

    public static void main(String[] args) {

        int n=3;   // ways to get up if take 2 and 1 set at a time
        
        System.out.println(totalways(n));
    }
}
