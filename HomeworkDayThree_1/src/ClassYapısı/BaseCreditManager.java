package ClassYapısı;

public abstract class BaseCreditManager implements CreditManagerDao {
 
	//değişkendir 
	public abstract void calculate();
		
	
	public void save() {
		System.out.println("Kaydedildi");
	}
	
}
