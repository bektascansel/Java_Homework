
public class Main {

	public static void main(String[] args) {
		
		
		
		
		//if 
		
		
		int sayi=24;
		
		if(sayi<20) {
			System.out.println("sayi 20'den küçüktür");
		}else if(sayi>20) {
			System.out.println("sayi 20'den büyüktür");
		}else {
			System.out.println("sayi 20'ye eşittir");
		}
		
		
		
		
		
		
		
		
		// Switch/case 
		
		char grade='A';
		
		switch(grade) {
		  
		case 'A':
			System.out.println("Mükemmel : geçtiniz");
			break;
			
		case 'B':
			System.out.println("Çok güzel : geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil : geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		
		}
		
		
		
		
		
		
	}

}
