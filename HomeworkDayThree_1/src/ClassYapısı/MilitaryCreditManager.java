package ClassYapısı;

public class MilitaryCreditManager extends BaseCreditManager implements CreditManagerDao{

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı");
		
	}


}
