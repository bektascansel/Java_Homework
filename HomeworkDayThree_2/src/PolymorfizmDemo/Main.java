package PolymorfizmDemo;

public class Main {

	public static void main(String[] args) {
		
	BaseLogger[] loggers=new BaseLogger[] {new FileLogger(), new DatabaseLogger(),new EmailLogger()};
	
	for(BaseLogger logger:loggers) {
		logger.Log("log mesajı");
	}
		

	CustomerManager customerManager=new CustomerManager(new FileLogger());
	customerManager.add();
	
	
	
	
	
	
	}

}
