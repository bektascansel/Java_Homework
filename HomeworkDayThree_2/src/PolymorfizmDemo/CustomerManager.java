package PolymorfizmDemo;

public class CustomerManager {
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}




	public void add() {
		System.out.println("Müşteri eklendi");
		baseLogger.Log("loglandı");
		
		/*
		//Kötü Kod Bağımlılık oluşur.
		DatabaseLogger logger=new DatabaseLogger();
		logger.Log("loglandı");
		*/
		
	}
	
	
	
	
	
	
	
	
	

}
