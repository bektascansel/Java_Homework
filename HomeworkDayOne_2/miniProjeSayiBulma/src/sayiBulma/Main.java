package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int []sayilar={1,2,5,7,9,10};
		int aranacak=20;
		boolean varMı=false;
		
		for(int i=0;i<sayilar.length;i++) {
			if(i==aranacak) {
				varMı=true;
				break;
			}
		}
		
		
		if(varMı==true) {
			System.out.println("aranan sayi mevcuttur");
		}else {
			System.out.println("aranan sayi mevcut değildir");
		}
	}

}
