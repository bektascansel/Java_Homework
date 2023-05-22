package kodlama.io.Devs.business.responses.programmingLanguageResponse;

import java.util.List;

public class GetByIdProgrammingLanguageResponse {
   
	private int id;
	private String name;
	private List<String> technologiesName;
	
	
	public GetByIdProgrammingLanguageResponse(int id, String name, List<String> technologiesName) {
		this.id = id;
		this.name = name;
		this.technologiesName = technologiesName;
	}

	
	

	public GetByIdProgrammingLanguageResponse() {
	
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




	public List<String> getTechnologiesName() {
		return technologiesName;
	}




	public void setTechnologiesName(List<String> technologiesName) {
		this.technologiesName = technologiesName;
	}



}
