import java.util.ArrayList;


public class subset {

    public static void makeit(int [] arr,ArrayList<Integer> ar,int index){

        int length=arr.length;

        if(index>=length){

            System.out.println(ar);  // not full subset is saving in a array list we print it time by time

            return;
        }

        

        makeit(arr, (ArrayList<Integer>)ar.clone(), index+1);  //exclude one remain same only index increase

        ar.add(arr[index]);
        
        makeit(arr, ar, index+1);

        
    }
    

    public static void main(String[] args) {

        ArrayList ar= new ArrayList<>();

        int [] arr={1,2,3};

        int index=0;


        makeit(arr,ar,index);

        System.out.println(ar);
        

    }
}
