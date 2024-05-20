package question.binary;

class kokoeating {

    public static int gethour(int mid,int [] arr){
        int count=0;

        System.out.print(mid);    // banana eat at per hour

        for(int i=0;i<arr.length;i++){
                                           //  3,6,7,11
                                           //  1,(1+2)3,(3+3)6,(6+4)10
            if(mid>=arr[i]){
                count++;
            }
            else{
                if(arr[i]%mid==0){
                     count+=(arr[i]/mid);
                }
                else{
                    count+=(arr[i]/mid)+1;
                }
            }

            
        }

        System.out.println("  "+count);   // hour taken

        return count;

    }
    public static void main(String[] args) {
        

        int [] arr= {30,11,23,4,20};

        

        int h=5 ;

         int s=1;
         
         int max=0;

         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
         }

        

         int e=max;

         int mid=(s+e)/2;

         int ans=h;   // beacause taking less that h hour

         while(s<=e){

            mid=(s+e)/2;   // banana take in one hour

            int hour= gethour(mid,arr);  // hour take to eat all banana

         
            

            if(hour<=h){     // now we want to make min banana
                e=mid-1;
                
            }
            else if(hour>h){    // 8>5 hour  so we take more banana at each hour
                s=mid+1;
            }

            if(hour<=h&&hour>0){
                ans=mid;
            }

            
            
           

            System.out.println(mid);

            

             

         }

         System.out.println(ans);

       

        
    }
}