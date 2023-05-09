package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number=17;
		boolean remainder=true;
	
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				System.out.println("sayi asal sayi değildir.");
				remainder=false;
				break;
			}
			
		}
		
		if(remainder==true) {
		System.out.println("sayi asal sayidir");
		}
		

	}

}
