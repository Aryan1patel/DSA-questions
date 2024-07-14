package question.HashMap;

import java.util.HashMap;

public class permutaionofstring {

    private static boolean checkMapsEqual(HashMap<Character, Integer> mp1, HashMap<Character, Integer> mp2) {
        if (mp1.size() != mp2.size()) {
            return false;
        }
        for (char key : mp1.keySet()) {
            if (!mp2.containsKey(key) || !mp1.get(key).equals(mp2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static void checkInclusion(String s1, String s2) {

        HashMap<Character,Integer> mp= new HashMap<>();

        for(int i=0;i<s1.length();i++){
            mp.put(s1.charAt(i),mp.getOrDefault(s1.charAt(i),0)+1);
        }

        // System.out.println(mp);


        HashMap<Character,Integer> mp2= new HashMap<>();

       
        int start=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);

            mp2.put(ch, mp2.getOrDefault(ch, 0) + 1);   // Add current character to mp2
            
            
            // Adjust window size if it exceeds length of s1
            if(i-start+1>s1.length()){
                char left = s2.charAt(start); 
                mp2.put(left,mp2.get(left)-1);      // removing start char moving sliding window

                if (mp2.get(left) == 0) {
                    mp2.remove(left);           // if the left element value is 0 remove it from map
                }

                start++;                          // increment start
            }

            if(i-start+1==s1.length()){
                if (mp.equals(mp2)) {
                    System.out.println("true");
                }
            }
                
            
            
        }

        
    }
    

    public static void main(String[] args) {

        String s1="aba";
        String s2="falbabaakg";

        checkInclusion(s1, s2);
        
    }
}
