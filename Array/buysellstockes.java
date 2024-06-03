import java.util.ArrayList;

public class buysellstockes {
    
    public static void main(String[] args) {

        ArrayList<Integer> prices= new ArrayList<>();

        // prices.add(17);
        // prices.add(20);    // we do not take max before min frist take min to make profit
        // prices.add(11);
        // prices.add(9);
        // prices.add(12);
        // prices.add(6);

        prices.add(98);
        prices.add(101);    
        prices.add(66);
        prices.add(72);

        
        
        // int max=0;
        // int min=9999;

        // int maxind=0;
        // int minind=0;

        // int maxprofit=0;

        // int ans=0;

        // for(int i=0;i<prices.size();i++){




        //     if(prices.get(i)<min){
        //         min=prices.get(i);
        //         minind=i;
               
        //     }

        //     if(prices.get(i)>max){
        //         max=prices.get(i);
        //         maxind=i;
                
        //     }

        //     if(maxind-minind>=0){

        //         maxprofit=max-min;


        //     }
        //     if(minind>maxind){
        //         max=prices.get(minind);
        //     }

        //     System.out.println(max+"   "+min);

        //     if(maxprofit>ans){
        //         ans=maxprofit;
        //     }





           
            
        // }



     

        // System.out.println(ans);


        // better

        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
    
    
        for (int i=0;i<prices.size();i++){
    
    
            minPrice=Math.min(minPrice,prices.get(i));  // min change time by time if min come frist
    
            maxPro=Math.max(maxPro,prices.get(i)-minPrice);   // ans the next max after the new min check the profit
    
    
        }

        System.out.println(maxPro);
    }
}
