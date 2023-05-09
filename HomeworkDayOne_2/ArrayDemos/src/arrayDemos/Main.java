package arrayDemos;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		
		System.out.println("------------------------------");
		
		
		String[] ogrenciler=new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		
		
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}

		/*
		 * for(String ogrenci:ogrenciler){
		 * System.out.println(ogrenci);
		 * }
		 */
		
		
		
		
		
		
		System.out.println("----------------");
		
		
		
		// Çok boyutlu diziler
		
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakır";
		sehirler[2][1]="Şanlıurfa";
		sehirler[2][2]="Gaziantep";
		
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(sehirler[i][j]);
				System.out.print(" ");
			}
			
			System.out.println();
		}

	
	
	
	}

}
