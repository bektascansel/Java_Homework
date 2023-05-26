package kodlama.io.Devs.business.responses.languageTechnologyResponse;

public class GetByIdLanguageTechnologyResponse {
	private int id;
	private String technologyName;
	private String languageName;
	
	
	public GetByIdLanguageTechnologyResponse(int id, String technologyName, String languageName) {
	
		this.id = id;
		this.technologyName = technologyName;
		this.languageName = languageName;
	}


	public GetByIdLanguageTechnologyResponse() {
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTechnologyName() {
		return technologyName;
	}


	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}


	public String getLanguageName() {
		return languageName;
	}


	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}