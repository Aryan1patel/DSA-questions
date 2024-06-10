
public class swap_alternate_arry {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 , 5 ,6 ,7,8 ,9,10,11,12 ,13 };

        int temp = 0;

        if (arr.length % 2 == 0) {

             System.out.println("even no array");
             System.out.println(" ");

            for (int i = 0; i < arr.length; i += 2) {

                temp = arr[i]; // like right one is empting and filling left one and lower fill it by the lower
                               // right one and that right one is empty

                arr[i] = arr[i + 1];

                arr[i + 1] = temp;

               

            }

        }






        else if (arr.length % 2 != 0) {

            System.out.println("odd no array");
            System.out.println(" ");


            for (int a = 0; a < (arr.length) / 2; a += 2) {

                temp = arr[a];
                arr[a] = arr[a + 1];
                arr[a + 1] = temp;

                

                

            }

        

             for (int b = ((arr.length) / 2) + 1; b < arr.length; b += 2) {

             temp = arr[b];
             arr[b] = arr[b + 1];
             arr[b + 1] = temp;


         }

    }

        for (int a : arr) {
            System.out.println(a);
        }

    }

}
