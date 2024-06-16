import java.util.ArrayList;

public class setmatrizzero {
    
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Add some rows to the ArrayList.
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        

        // Add some elements to each row. 

        /*2 3
        2 4 3
        1 0 0 */
        list.get(0).add(2);
        list.get(0).add(4);
        list.get(0).add(3);

        list.get(1).add(1);
        list.get(1).add(0);
        list.get(1).add(0);

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.get(i).size(); j++) {

                System.out.print(list.get(i).get(j) + " ");

            }
            System.out.println();
        }

        System.out.println(" ");

    
      for(int i=0;i<list.size();i++){
        for(int j=0;j<list.get(i).size();j++){
            if(list.get(i).get(j)==0){

                System.out.println("at i "+i+ " and j "+j);

                for(int a=0;a<list.size();a++){
                    list.get(i).set(a, 0);

                     System.out.println("setting      "+i+" "+a+" to zero");
                }

                for(int a=0;a<list.size();a++){
                    list.get(a).set(j, 0);

                    // System.out.println(list.get(a).set(i, 0));
                    System.out.println("setting      "+a+" "+i+" to zero");
                }
            }
        }
      }

        // Print the ArrayList.
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.get(i).size(); j++) {

                System.out.print(list.get(i).get(j) + " ");

            }
            System.out.println();
        }
}
}
