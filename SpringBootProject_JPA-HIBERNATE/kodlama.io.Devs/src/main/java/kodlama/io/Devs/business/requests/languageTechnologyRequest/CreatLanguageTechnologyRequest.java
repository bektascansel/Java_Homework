package kodlama.io.Devs.business.requests.languageTechnologyRequest;

public class CreatLanguageTechnologyRequest {
	
	private String name;
	
	private int languageId;

	
	public CreatLanguageTechnologyRequest(String name, int languageId) {
		this.name = name;
		this.languageId = languageId;
	}
	

	public CreatLanguageTechnologyRequest() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLanguageId() {
		return languageId;
	}


	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	
	
	
	
	
	
	
	
	
	

}
