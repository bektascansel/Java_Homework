package kodlama.io.Devs.business.responses.programmingLanguageResponse;

import java.util.List;

public class GetAllProgrammingLanguageResponse {
	
	private int id;
	private String name;
	private List<String> technologiesNames;
	
	
	
	
	public GetAllProgrammingLanguageResponse(int id, String name, List<String> technologiesNames) {
		this.id = id;
		this.name = name;
		this.technologiesNames = technologiesNames;
	}



	public GetAllProgrammingLanguageResponse() {
		
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public List<String> getTechnologiesNames() {
		return technologiesNames;
	}



	public void setTechnologiesNames(List<String> technologiesNames) {
		this.technologiesNames = technologiesNames;
	}



	
	

	
	
	
	
	
}
