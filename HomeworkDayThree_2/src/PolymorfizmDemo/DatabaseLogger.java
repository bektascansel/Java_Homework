package PolymorfizmDemo;

public class DatabaseLogger extends BaseLogger{

	public void Log(String mesaj) {
		System.out.println("logged to database: "+mesaj);
	}
}
