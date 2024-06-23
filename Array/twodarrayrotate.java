public class twodarrayrotate {
    
    public static void main(String[] args) {
        
        int [][] arr={{1,2,3},         // old 1(1,1) new 1(1,3)            // 0 consider as 1 here
                      {4,5,6},         // old 4(2,1) new 4(1,2)  old 7(3,1) new 7(1,1)
                      {7,8,9}};       // when rotating 90 degree new i become old j
     
        int [][] arr2= new int[3][3];              

        
         for(int i=0;i<3;i++){

             int newi=0;
             int newj=0;

             for(int j=0;j<3;j++){

               System.out.print(arr[i][j]);
                 newi=j;         // now giving change old j value and putting it on new i
                 newj=2-i;
                
          

             arr2[newi][newj]=arr[i][j];
             


             }
             System.out.println(" ");
         }

        System.out.println(" ");
        
        for(int a=0;a<3;a++){

            for(int j=0;j<3;j++){
            
                System.out.print(arr2[a][j]);

            }

            System.out.println(" ");
        }

        
    }
}
