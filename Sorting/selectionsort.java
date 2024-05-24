class selectionsort {
    static void  select(int arr[], int i)
	{
	    
	    int min=9999;
	    
	    int no=0;
	    
	  
	  
       for(int j=i;j<arr.length;j++){
           
           if(arr[j]<min){
               min=arr[j];
               no=j;
           }
       }
       
       
       int temp=arr[i];
       arr[i]=min;
       arr[no]=temp;
	}
	
	public static void main(String[] args) {
        
     int [] arr={4, 1, 3, 9, 7};
	  
	  
	  for(int i=0;i<arr.length;i++){
	      
	      select(arr,i);
	      
	      
	  }

      for(int a:arr){
        System.out.print(a+" ");
      }
}
}