package question.array;

import java.util.ArrayList;

public class contain {
    

    public static void main(String[] args) {
        
        int [] arr= {1,2,3,1};

        ArrayList<Integer> al= new ArrayList<>();
        int val=0;


        for(int i=0;i<arr.length;i++){
            if(al.contains(arr[i])){
                System.out.println("true");
                val=1;
            }
            al.add(arr[i]);
        }

        if(val==0){
            System.out.println("false");
        }

    }
}
