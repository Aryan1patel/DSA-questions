import java.util.ArrayList;

public class subsequence {


   public static void subit(String str,ArrayList<Character> ar,int index,ArrayList<ArrayList<Character>> ans ){

        
    if(index>=str.length()){

        ans.add(ar);

        System.out.println(ar);

        
        
        return;
    }


    subit(str, (ArrayList<Character>)ar.clone(), index+1,ans); // recursive call for origional ar
                                                     // exclusive // copy of arraylist ar because we have to get a new empty array

    // now to make the clone of the ar then we add new value in new ar to add in arr
    ar.add(str.charAt(index));  // we are adding character in ar mean we are adding the no (charat(index)) which is in include

    // modify ar add adding a new no

    // and there is no removing any element from ar we pass recursive for every ar inclusive and exlusive
   
    subit(str, ar, index+1,ans);  // recursive call for modifided ar mean (recursive for inclusion) we add charat(index)
    




        
    }
    

    public static void main(String[] args) {
        
        String str="abc";

        ArrayList<Character> ar= new ArrayList<>();

        ArrayList<ArrayList<Character>> ans= new ArrayList<>();



        int index=0;

        subit(str,ar,index,ans);

        System.out.println(ans);
    }
}
