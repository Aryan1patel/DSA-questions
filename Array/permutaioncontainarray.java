public class permutaioncontainarray {

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


        String st1="bca";
        String st2="abc";

        for(int i=0;i<st1.length();i++){

            int index=st1.charAt(i)-'a';   // geting the no of index in alphabet range
            alpha1[index]++;  // now adding it in the array
        }

        for(int i=0;i<st2.length();i++){

            int index=st2.charAt(i)-'a';   // geting the no of index in alphabet range
            alpha2[index]++;  // now adding it in the array
        }

        System.out.println(comparearr(alpha1, alpha2));      // for only comparison we can make one array  and -- in other string loop if array is empty then both are equal
    }
}
