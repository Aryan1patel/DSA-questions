public class permutaionintwostring {
    static boolean comparearr(int [] arr1,int [] arr2){
        for(int i=0;i<arr1.length-1;i++){  // because both array are alphabatic range so both have same range

                if(arr1[i]!=arr2[i]){   // if any position value containg count do not match (mean if char 'a' comes 2 times in one in other 'a' is two times)

                    return false;
                }
        }

        return true;
        
    }
    public static void main(String[] args) {
        
        int [] alpha1 =new int[26];
        int [] alpha2 =new int[26];


        String st1="avsdfabcafjd";
        String st2="afbdc";

        for(int i=0;i<st2.length();i++){   // getting all alphabatic count no in the alpha2 array

            int index=st2.charAt(i)-'a';   // geting the no of index in alphabet range
            alpha2[index]++;  // now adding it in the array
        }

        int a=0; // starting position for window like in this case st2 has 3 length so window is of 3 length and now we moving in 3 length to check if permutaion of st2 present in st1

        int b=0;
        while(a<=st1.length()-st2.length()){  // for last 3 position in this case

         for(int i =a;i<=a+st2.length()-1;i++ ){   // only traverse 3 length like 012 123 234

             int index2=st1.charAt(i)-'a';
           
             alpha1[index2]++;               // adding next 3 element index in alpha1 array in alphabatic range
          
         }

         if(comparearr(alpha1, alpha2)){
            // System.out.println(st1.charAt(a)+" at "+a);
            System.out.println("true");
            b=1;
            break;
         }
         alpha1=new int[26];             // now emptying the array of window (of 3 character) count for next 3 numbers
    

        a++;

     }
     if(b==0){

        System.out.println("False");
     }

        
    
    }
}
