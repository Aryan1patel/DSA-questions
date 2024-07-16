import java.util.ArrayList;

public class dailpad {

   static void getit( String num,String [] mapping,StringBuilder output,int index,ArrayList<String> ans){

    
    if(index>=(num.length())){

      ans.add(output.toString());

   //   System.out.println(output);
        
        return;
    }


    int number=num.charAt(index)-'0';  //convert string into integer and getting seprated index like from 23 to 2 and 3

    String value=mapping[number];  // getting the value of the string at the no mean if number is 2 value is abc

 
    for(int i=0;i<value.length();i++){  // for frist case value is abc

        // output+=value.charAt(i);

        output.append(value.charAt(i));

        

      

        getit(num,mapping, output, index+1, ans);

        output.deleteCharAt(output.length()-1);
        

    }

   // System.out.println(number);



   }
    

    public static void main(String[] args) {
        
        String no="23";

        int index =0;

        String [] mapping= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


        


        StringBuilder output = new StringBuilder();
        ArrayList<String> ans=new ArrayList<>();

      getit(no,mapping,output,index,ans);

      System.out.println(ans);

     //   System.out.println(String.valueOf(no).length()-1);

    }
}
