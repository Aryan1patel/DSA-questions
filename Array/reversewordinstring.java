public class reversewordinstring {
    public static void main(String[] args) {
        
        String st="hy hello and by";

        String newst= "";


        System.out.println(newst);

        int a=0;

        
        for(int i=0;i<st.length();i++){
            String word="";
            if(st.charAt(i)==' '||i==st.length()-1){

                for(int j=i-1;j>=a;j--){
                  
                    word=word+st.charAt(j);
                    
                }
                newst+=word;
                newst+=" ";
                a=i+1;

            }

        }

        System.out.println(newst);
    }
}
