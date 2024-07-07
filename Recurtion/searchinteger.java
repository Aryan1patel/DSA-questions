package question.recurtion;



public class searchinteger {

    static int findiinteger(int [] arr,int a,int count){


        if(count>=arr.length){
            return -1;
        }

        
        if(arr[count]==a){  
            return count;
        }
        
        return findiinteger(arr,a,count+1);


        // if(arr[count]==a){  
        //     return true;
        // }
        // if(count>=arr.length-1){
        //     return false;
        // }
        
        // return findiinteger(arr,a,count+1);

        // other method is to start searching from last
    }

    
    
    public static void main(String[] args) {
        
        int [] arr ={5,1,3,2,4,6};
        int key=2;


        System.out.println(findiinteger(arr,key,0));

    }


}
