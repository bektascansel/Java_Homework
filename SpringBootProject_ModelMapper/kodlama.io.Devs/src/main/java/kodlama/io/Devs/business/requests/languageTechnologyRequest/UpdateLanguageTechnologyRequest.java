package kodlama.io.Devs.business.requests.languageTechnologyRequest;

public class UpdateLanguageTechnologyRequest {
	
	private String technologyName;
	
	private int  languageId;

	public UpdateLanguageTechnologyRequest(String technologyName, int languageId) {
		this.technologyName = technologyName;
		this.languageId = languageId;
	}

	public UpdateLanguageTechnologyRequest() {
		
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	



	
	
	
	
	
	
	

}
