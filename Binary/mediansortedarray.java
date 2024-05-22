import java.util.ArrayList;

public class mediansortedarray {
    

    // public static void main(String[] args) {
        
    //     int [] arr1={2,4,6};
    //     int [] arr2={1,3,5};

    //     // int [] ans= new int[arr1.length+arr2.length];


    //     ArrayList<Integer> ans= new ArrayList<>();

    //     int s1=0;
    //     int s2=0;

        
        


    //     while(s1<=arr1.length-1&&s2<=arr2.length-1){

    //         if(arr1[s1]<arr2[s2]){

    //             ans.add(arr1[s1]);
    //             s1++;
    //         }

    //         else{

    //             ans.add(arr2[s2]);
    //             s2++;
    //         }

    //     }

    //     while(s1<=arr1.length-1){

    //         ans.add(arr1[s1]);

    //         s1++;


    //     }

    //     while(s2<=arr2.length-1){

    //         ans.add(arr2[s2]);

    //         s2++;

    //     }

    //     System.out.println(ans);

    //     float median= 0;

    //     int midno=(ans.size()-1)/2;



    //     if((ans.size()-1)%2==0){

    //         median= ans.get(midno);

    //         System.out.println("hi");

    //     }
    //     else{
    //         median= (ans.get(midno)+ans.get((midno+1)))/2.0f;
            
    //     }

    //     System.out.println(median);

    // }


    // optimal

    // we just find the index of the element(when they happen to be merger) that are present in both diffrent array withour merging them

    public static void main(String[] args) {
        
        int [] arr1={2,4,6};
        int [] arr2={1,3,5};


        int s1=0;
        int s2=0;

        int count=0;

        int mid1=((arr2.length+arr1.length)/2);        // 3
        int mid2=mid1-1;     // main mid               // 2
        
        int val1=0;
        int val2=0;

        int current=0;

        
        
           // finding mid element while merging

        while(s1<=arr1.length-1&&s2<=arr2.length-1){

            

            if(arr1[s1]<arr2[s2]){
                

                

                if(count==mid1){
                  val1=arr1[s1];

                  val2=current;
                }

                current=arr1[s1];

                s1++;
                
            }
            else{
                


                

                if(count==mid1){
                    val1=arr2[s2];
  
                    val2=current;
                  }

                  current=arr2[s2];

                  s2++;
            }



            

            count++;

          

            

        }

        
        if((arr2.length+arr1.length)%2==0){
            float ans= (val1+val2)/2.0f;
            System.out.println(ans);
        }
        else{
            
            System.out.println(val2);
        }

    }
}
