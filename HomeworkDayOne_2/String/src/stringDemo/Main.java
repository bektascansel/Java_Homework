package stringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		
		System.out.println(mesaj);
		System.out.println("Eleman sayısı: "+mesaj.length());
		System.out.println("5.Eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler=new char[5];
		
		mesaj.getChars(0,5,karakterler, 0);
		System.out.println(karakterler);

		//karakterin kaçıncı olduğunu bulur.İlk bulduğu yerde aramayı bitirir
		System.out.println(mesaj.indexOf('a'));
		
		System.out.println(mesaj.lastIndexOf('a'));
		
		
		
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2,5));
		
		//karakterleri belli bir kurala göre ayırma
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
		
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.toLowerCase());
		
		//stringin başındaki ve sonundaki boşlukları atar.
		System.out.println(mesaj.trim());
	}

}
