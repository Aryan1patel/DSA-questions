package question.array;

public class findDuplicate {
    

    public static int findDuplicate(int[] nums) {              
        // using method of floyd from linked list using in array to find duplicate in which duplicated is pointed by two node
   
        int slow=0;
        int fast=0;
   
        while(true){
     
           slow=nums[slow];           // making slow first index and increment one by one
           fast=nums[nums[fast]];     
   
         //while moving in circular
           if(slow==fast){
                break;
           }
        }
   
        int slow2=0;  // starting from start
   
        while(slow!=slow2){
           slow=nums[slow];
           slow2=nums[slow2];
        }
   
        return slow;
   
   

   
   
       }

       public static void main(String[] args) {
        
        int [] arr={1,2,3,4,2};

        findDuplicate(arr);

        System.out.println(findDuplicate(arr));


        
       }
}
