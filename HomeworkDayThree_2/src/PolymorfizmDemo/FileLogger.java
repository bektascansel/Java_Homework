package PolymorfizmDemo;

public class FileLogger extends BaseLogger{

	public void Log(String mesaj) {
		System.out.println("logged to file: "+mesaj);
	}
}
