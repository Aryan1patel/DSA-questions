public class noofcharinalphabet {
    public static void main(String[] args) {
        

        int [] alphabhet= new int[26];
      

        String st1="safabcsadj";
        String st2="abc";


        for(int i=0;i<st1.length();i++){

            int index=st1.charAt(i)-'a';   // getting the index to the letter in alphabet 26

            alphabhet[index]++;     // add in their specific position

        }


        for(int a:alphabhet){
            System.out.print(a+" ");
        }
    }
}
