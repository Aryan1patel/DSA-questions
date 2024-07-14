package question.HashMap;

import java.util.HashMap;

public class countarrayinteger {
    

    public static void main(String[] args) {
        
        int [] arr={ 1, 2, 2,2,2,2,2, 3, 3, 3, 4,4};

        HashMap<Integer,Integer> mp= new HashMap<>();


        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }

        int max=-999;
        int maxno=0;
        int minno=0;
        int min=999;

        for(int key : mp.keySet()){
            System.out.println(key+" comes "+mp.get(key)+" times");

            if(mp.get(key)<min){
                min=mp.get(key);
                minno=key;
            }
            if(mp.get(key)>max){
                max=mp.get(key);
                maxno=key;
            }

           
        }

        System.out.println(minno);
        System.out.println(maxno);


        

        
    }
}
