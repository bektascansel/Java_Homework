package kodlama.io.Devs.business.responses.languageTechnologyResponse;

public class GetByIdLanguageTechnologyResponse {
	private String name;
	private int id;
	private int languageId;
	
	
	public GetByIdLanguageTechnologyResponse(String name, int id, int languageId) {
		this.name = name;
		this.id = id;
		this.languageId = languageId;
	}

    
	
	public GetByIdLanguageTechnologyResponse() {
	
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getLanguageId() {
		return languageId;
	}


	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
}
