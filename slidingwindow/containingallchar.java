package question.slidingwindow;

import java.util.HashMap;

public class containingallchar {
    
    public static void main(String[] args) {

        String s="abcabc";
        
        HashMap<Character,Integer> mp= new HashMap<>();  // for substring

        int start=0;

        int count=0;


        for(int i=0;i<s.length();i++){

            char ch= s.charAt(i);

            mp.put(ch, mp.getOrDefault(ch, 0)+1);

                
                while(mp.containsKey('a')&&mp.containsKey('b')&&mp.containsKey('c')){ // then check from removing stating character

                    count+=s.length()-i;

                    char startch=s.charAt(start);

                    mp.put(startch, mp.getOrDefault(startch, 0)-1);  // removing character count from the start

                    if(mp.get(startch)==0){
                        mp.remove(startch);    // if map contain 0 value of any character remove it from map
                    }

                    start++;

                }
            
            
            

        }

        System.out.println(count);
        
    }
}
