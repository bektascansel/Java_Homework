package kodlama.io.Devs.business.requests.languageTechnologyRequest;

public class UpdateLanguageTechnologyRequest {
	
	private String name;
	
	private int  languageId;
	


	public UpdateLanguageTechnologyRequest(String name, int languageId, int id) {
		
		this.name = name;
		this.languageId = languageId;
		
	}

	public UpdateLanguageTechnologyRequest() {
		
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
