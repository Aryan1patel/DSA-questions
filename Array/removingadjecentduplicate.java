public class removingadjecentduplicate {

    static boolean indexcount2check(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                return true;
            }
        }
        return false;
    }

    static void test(String st,String st1){
    int [] alpha1=new int[26];   
           
        
       int a=0; 
       
        while(a<st.length()-1){
            
            for(int i=a;i<=a+1;i++){
            int index=st.charAt(i)-'a';
            alpha1[index]++;

          }
        
          if(indexcount2check(alpha1)==false){
            st1+=st.charAt(a);
          }
          else{

            a++;
          }
          if(a==st.length()-2){
           
            st1+=st.charAt(a+1);
          }

          alpha1=new int[26];
         

          a++;
         
        }

        System.out.println(st1);
    }
    public static void main(String[] args) {
        
        String st="abbaca";
        String st1="";

 
        int a=0;
        
    

        test(st, st1);
    
       
       
        
       
    }
}
