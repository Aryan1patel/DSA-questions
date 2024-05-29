package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
     public List<List<Integer>> threeSum(int[] arr) {
        
        List<List<Integer>> ans= new ArrayList<>();
        int s,e;

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            s=i+1;
            e=arr.length-1;

              if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicates

            while(s<e){
                int sum=arr[i]+arr[s]+arr[e];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i],arr[s],arr[e]));
                    
                       // Skip duplicates for s
                    while (s < e && arr[s] == arr[s + 1]) s++;
                    // Skip duplicates for e
                    while (s < e && arr[e] == arr[e - 1]) e--;

                    s++;
                    e--;
                }
                else if(sum<0){  // mean we go next from negative value to make it 0 because sum is negative
                    s++;
                }
                else{
                    e--;
                }

            }
           
        }

        return ans;
    }
}
