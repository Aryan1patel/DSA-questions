
import java.util.ArrayList;

public class ratmaze {

    static boolean verify(int x,int y,int [][] arr,int [][] tempar){

        if((x>=0&&x<arr.length)&&(y>=0&&y<arr.length)&&tempar[x][y]==0&&arr[x][y]==1){

        
            return true;
        }

        else{
            return false;
        }
    }


    static void findtrack(int [][] arr,int x,int y,String ans,int [][] tempar,ArrayList<String> store){

        if(x==arr.length-1&&y==arr.length-1){

            store.add(ans.toString());

            return ;

        }

       // System.out.println("hh");

        tempar[x][y]=1; // visited this position

        int newx=x+1;
        int newy=y;




       // System.out.println("kk");

        if(verify(newx, newy, arr, tempar)){

           // ans.append("D");

            // System.out.print("D");

            findtrack(arr,newx,newy,ans+"D",tempar,store);

            // ans.delete(0, ans.length()-1);

        }

         newx=x;
         newy=y-1;

        if(verify(newx, newy, arr, tempar)){

            // ans.append("L");

            // System.out.print("L");

            findtrack(arr, newx, newy, ans+"L", tempar, store);

           // ans.delete(0, ans.length()-1);

        }


        newx=x-1;
         newy=y;

        if(verify(newx, newy, arr, tempar)){

            // ans.append("U");

            // System.out.print("U");

            findtrack(arr, newx, newy, ans+"U", tempar, store);

           // ans.delete(0, ans.length()-1);

        }

        newx=x;
         newy=y+1;

        if(verify(newx, newy, arr, tempar)){

            // ans.append("R");

            // System.out.print("R");

            findtrack(arr, newx, newy, ans+"R", tempar,store);

            // ans.delete(0, ans.length()-1);

        }

      
      


    }
    

    public static void main(String[] args) {
        
        int [][] arr= {{1,0,0,0},
                       {1,1,0,1},
                       {1,1,0,0},
                       {0,1,1,1}};

        int x=0;
        int y=0;

        String ans="";

        int [][] tempar= new int[4][4];


        for(int i=0;i<tempar.length;i++){
            for(int j=0;j<=3;j++){
                tempar[i][j]=0;
            }
        }

        ArrayList<String> store= new ArrayList<>();

        
    
        
        findtrack(arr,x,y,ans,tempar,store);

        //System.out.println(ans);
        System.out.println(store);


    }



}
