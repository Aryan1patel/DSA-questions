public class ratinmaze {

    public static void main(String[] args) {

        int[][] arr = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 1, 0 },
                        { 0, 0, 1, 1 } };

        
                        for (int i = 0; i <= arr.length-1; i++) {             // this array to store the path that we already cover
                            for (int j = 0; j <= 3; j++) {
                                
                                System.out.print(i+""+j+","+"   ");
                            }
                            System.out.println(" ");
                        }



        StringBuilder ans = new StringBuilder();

        int[][] tempar = new int[4][4];
        

        for (int i = 0; i <= tempar.length-1; i++) {             // this array to store the path that we already cover
           for (int j = 0; j <= 3; j++) {
               tempar[i][j] = 0;
           }
        }

        int x = 0;
        int y = 0;



        while(x<arr.length&&y<arr.length){
        
                
                System.out.println("hhh");

                if(x==arr.length-1&&y==arr.length-1){
                    break;
                }


                if(y+1<=arr.length-1){
                
                if(arr[x][y+1]==1&&tempar[x][y+1]==0){   //down

                    System.out.println(x+" "+y);

                    ans.append("R");

                    System.out.println("R");
                    y++;

                    tempar[x][y]=1;
                    continue;
                }

            }

                
            if(x-1>=0){

                if(arr[x-1][y]==1&&tempar[x-1][y]==0){   //left

                    System.out.println(x+" "+y);
                    ans.append("U");

                    System.out.println("U");
                    x--;

                    tempar[x][y]=1;

                    continue;
                }
            }

 

            if(x+1<=arr.length){
                

                if(arr[x+1][y]==1&&tempar[x+1][y]==0){   //right

                    System.out.println(x+" "+y);
                    ans.append("D");
                    System.out.println("D");
                    x++;

                    tempar[x][y]=1;

                    continue;
                }
            }

            if(y-1>=0){

                if(arr[x][y-1]==1&&tempar[x][y-1]==0){   //up
                    System.out.println(x+" "+y);
                    ans.append("L");
                    System.out.println("L");
                    y--;

                    tempar[x][y]=1;

                    continue;
                }

            }

            

            // if(x==arr.length-1&&y==arr.length-1){
            //     break;
            // }
        }

        System.out.println(ans);




    

    }
}
