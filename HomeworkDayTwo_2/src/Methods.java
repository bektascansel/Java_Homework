public class Methods{

	public static void main(String[] args) {
		
		sayiBulma();

	}

	
	public static void sayiBulma() {
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
			mesajVar(aranacak);
		}else {
			System.out.println("aranan sayi mevcut değildir");
		}
	}
	
	public static void mesajVar(int aranacak) {
		System.out.println("aranan sayi mevcuttur"+aranacak);
	}
	
	
}