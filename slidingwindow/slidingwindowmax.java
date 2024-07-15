package question.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class slidingwindowmax {
    

    public static int[] maxSlidingWindow(int[] arr, int k) {

          if (arr == null || arr.length == 0) {
            return new int[0];
        }

        Deque<Integer> dq= new LinkedList<>();
        int count=0;

        int start=0;

        int [] ans= new int[arr.length-k+1];

        for(int i=0;i<arr.length;i++){

            if (!dq.isEmpty() && dq.peekFirst() < i-k+1) {
                dq.pollFirst();
            }

            while(!dq.isEmpty()&& arr[dq.peekLast()]<arr[i]){  // if current element is greater than previous last element remove it
                 dq.pollLast();              
            }

            dq.addLast(i);


            if(i-start+1>k){
                start++;
            }

            if(i-start+1==k){
                ans[count++]=arr[dq.peekFirst()];
            }



        }

        return ans;


        
    }

    public static void main(String[] args) {
        
        int [] arr= {1,3,-1,-3,5,3,6,7};

        int k=3;

        int [] ans= maxSlidingWindow(arr, k);

        for(int a:ans){
            System.out.print(a+ " ");
        }
    }
}
