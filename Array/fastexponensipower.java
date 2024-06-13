public class fastexponensipower {
    public static void main(String[] args) {
        
        int a=2;

        int n=8;     // power

        int res=1; 

        while(n>0){
            if(n%2!=0){
                res=res*a;       // for odd no and also for last no which is one when dividing contineusly by 2 so goes to result
            }

            a=a*a;   // mean squaring

           n= n>>1;   // use to divide by 2 by fast

           // in this we contineusly divide power by two and squaring the no which make it shorter

           // like 2 power 8 or 2^8   and dividing and multiplytin power by 2

           // we can write as (2^4)^2  (2^2)^2^2  we only have to square 3 times 
           //                            (4)^2^2
           //                            (16)^2
           //                            (256)                                                                                        

        }

        System.out.println(res);


    }
}
