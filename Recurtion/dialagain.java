import java.util.ArrayList;

public class dialagain {

    static void getno(String no,int index,StringBuilder st,ArrayList<String > ans,String [] map ){

        if(index>=no.length()){

            ans.add(st.toString());

            return;
        }

        int number= no.charAt(index)-'0';

        String val=map[number];

        for(int i=0;i<val.length();i++){
            st.append(val.charAt(i));

            getno(no, index+1, st, ans, map);

            st.deleteCharAt(st.length()-1);
        }


    }
    

    public static void main(String[] args) {
        
        String input="23";

        int index=0;

        ArrayList<String> ans= new ArrayList<>();

        StringBuilder st= new StringBuilder();

        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        getno(input,index,st,ans,map);

        System.out.println(ans);
        
    }
}
