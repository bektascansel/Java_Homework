package Abstract;

public abstract class GameCalculator {

	//override edilmek zorundadır.
	public abstract void hesapla();
	
	
	//override edilemez
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
	
}
