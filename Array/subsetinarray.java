import java.util.ArrayList;
import java.util.List;

public class subsetinarray {

    public static void makesubset(int arr [],List<Integer> output, List<List<Integer>> ans, int i ){

        if(i==arr.length){  // work on i than add on i+1 mean 3th index
            ans.add(new ArrayList<>(output));  // add subst in ans list by making a copy of it
            return;
        }

        // exclusive case

        makesubset(arr, output, ans, i+1);

        // inclusive call


        output.add(arr[i]);

        makesubset(arr, output, ans, i+1);

        output.remove(output.size()-1);  // backtracking removing last element



    }
    public static void main(String[] args) {
        
        int arr [] = {1,2,3};

        List<List<Integer>> ans = new ArrayList<>();   // in this ans list we store subset 

        List<Integer> output = new ArrayList<>();

        int i =0;  // track index of current no

        makesubset(arr, output, ans, i);

        System.out.println(ans);
    }
}
