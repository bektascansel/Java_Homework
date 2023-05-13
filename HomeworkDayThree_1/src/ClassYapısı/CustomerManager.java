package ClassYapısı;

public class CustomerManager {
	
	private Customer customer;
	private CreditManagerDao creditManagerDao;
	
	public CustomerManager(Customer customer,CreditManagerDao creditManagerDao) {
		this.customer=customer;
		this.creditManagerDao=creditManagerDao;
		
	}
	
	

	public void save() {
		System.out.println("Müşteri kaydedildi: ");
	}
	
	
	
	public void delete() {
		System.out.println("Müşteri silindi: ");
	}
	
	
	public void giveCredit() {
		creditManagerDao.calculate();
		System.out.println("Kredi verildi ");
	}
}
