package kodlama.io.Devs.business.requests.languageTechnologyRequest;

public class CreatLanguageTechnologyRequest {
	
	private String technologyName;
	
	private int languageId;
	
	
	public CreatLanguageTechnologyRequest() {
		
	}

	public CreatLanguageTechnologyRequest(String technologyName, int languageId) {
		this.technologyName = technologyName;
		this.languageId = languageId;
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
