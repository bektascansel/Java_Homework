package kodlama.io.Devs.webApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.programmingLanguageRequest.CreatProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.programmingLanguageRequest.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.business.responses.programmingLanguageResponse.GetAllProgrammingLanguageResponse;
import kodlama.io.Devs.business.responses.programmingLanguageResponse.GetByIdProgrammingLanguageResponse;

//Controller olduğu belirtildi
@RestController
//controller adresi verildi
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguageControllers {

	
	private ProgrammingLanguageService programmingLanguageService;

	
	@Autowired
	public ProgrammingLanguageControllers(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	@GetMapping("/GetAll")
	List<GetAllProgrammingLanguageResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	
	@PostMapping("/Post")
	void Add(CreatProgrammingLanguageRequest creatProgrammingLanguageRequest) throws Exception {
		programmingLanguageService.add(creatProgrammingLanguageRequest);
	}
	
	@DeleteMapping("/Delete")
	void delete(int id) {
		programmingLanguageService.delete(id);
	}
    
	@GetMapping("/GetById")
	Optional<GetByIdProgrammingLanguageResponse> getById(int id) {
		return programmingLanguageService.getById(id);
	}
	
	@PutMapping("/Update")
	void update(int id,UpdateProgrammingLanguageRequest languageRequest) {
		programmingLanguageService.update(id,languageRequest);
	}
	
	
	
	
	
	
	
	
}
