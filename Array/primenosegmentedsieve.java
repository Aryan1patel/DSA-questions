import java.util.ArrayList;
import java.util.Vector;


public class primenosegmentedsieve {


    public static void main(String[] args) {
        
        int n=100;
        
        boolean [] arrbool = new boolean[n+1];

        for(int i=0;i<=n;i++){
            arrbool[i]=true;
        }



        arrbool[0]=arrbool[1]=false;




        for(int i=0;i<=n;i++){

            System.out.println(arrbool[i]);

            if(arrbool[i]==true){

                for(int j=2*i;j<=n;j=j+i){

                   arrbool[j]=false;
                }
            }
            

            
        }








        for(int i=0;i<=n;i++){
            
            if(arrbool[i]==true){
                System.out.print(i+" ");
            }
        }

    }
}
