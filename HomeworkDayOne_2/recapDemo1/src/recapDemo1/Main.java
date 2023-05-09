package recapDemo1;

public class Main {

	public static void main(String[] args) {
	
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		int max=0;
		
		
		if(sayi1>sayi2) {
			max=sayi1;
		}else if(sayi1<sayi2) {
			max=sayi2;
		}else if(sayi3>max) {
			max=sayi3;
		}
		
		System.out.println(max);

	}

}
