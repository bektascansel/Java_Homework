package PolymorfizmDemo;

public class EmailLogger extends BaseLogger{
	
	public void Log(String mesaj) {
		System.out.println("logged to Email: "+mesaj);
	}

}
