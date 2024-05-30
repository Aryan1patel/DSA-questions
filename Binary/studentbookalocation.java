package question.binary;

public class studentbookalocation {
    
    public static boolean ispossible(int mid,int [] arr,int k){  // k is the no of subarray we have to split

        int count=0;
        int stu=1;
        
    
        for(int i=0;i<arr.length;i++){       // let mid == 32/2(16)
    
        count+=arr[i];

        if(arr[i]>mid){
            return false;
        }
    
        if(count>mid){  // now change to nextsub array

           
    
           count=0;
           stu++;      // now second student
          
           count=arr[i];

           if(i==arr.length-1&&count>mid){
            return false;
        }
    
          
        }
        
        
        if(stu>k){

            return false;
            
        }
        
    
    
    
              
        }
        
        return true;
    
    
    
    
    
        } 
        public static void main(String[] args) {
            
            int [] arr={2,3,1,2,4,3};
            int k=5;
        
            int min=0;
            int max=0;
            for(int i=0;i<arr.length;i++){
                max+=arr[i];
            }
            
    
    
            int s=min;
            int e=max;
    
            int mid=(s+e)/2;

            int ans=0;
    
             while(s<=e){
                mid=(s+e)/2;

                System.out.println(mid);

    
                if(ispossible(mid,arr,k)){
                    e=mid-1;  // because we want to minimize
                    System.out.println("pos in "+mid);
                    ans=mid;
                }
                else if(!ispossible(mid,arr,k)){
                    s=mid+1;
                    System.out.println("not pos in "+mid);
                }
    
             }
           

            System.out.println(ans);
            
        }
}
