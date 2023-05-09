package mukemmelSayi;

public class Main {
     public static void main(String[] args) {
    	 int sayi=28;
    	 int[] sayilar = new int[sayi];
    	 int j=0;
    	  
    	  for(int i=1;i<sayi;i++) {
    		  if(sayi%i==0) {
    			  sayilar[j]=i;
    			  j=j+1;
    		  }
    	  }
    	  
    	  int total=0;
    	  for(int i:sayilar) {
    		  total=total+i;
    	  }
    	  
    	  if(sayi==total) {
    		  System.out.println("sayi mükemmel sayidir.");
    	  }else {
    		  System.out.println("sayi mükemmel sayi değildir");
    	  }
    	 
    	 
    	 
     }
}
