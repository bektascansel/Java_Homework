package sesliHarfler;

public class Main {

	public static void main(String[] args) {
        
		char harf='E';
		
		switch(harf) {
             
		case 'A' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("harf kalın sesli harftir");
			break;
		
		case 'E' :
		case 'Ö' :
		case 'Ü' :
		case 'İ' :
			System.out.println("harf ince sesli harftir");
			break;
		
			
		default:
			System.out.println("harf sesli harf degildir");
			break;
				
				
				
				
				
		
		
		}
	}

}
