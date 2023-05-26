package kodlama.io.Devs.webApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	
	@GetMapping("/GET")
	List<GetAllProgrammingLanguageResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/POST")
	void Add(CreatProgrammingLanguageRequest creatProgrammingLanguageRequest) throws Exception {
		programmingLanguageService.add(creatProgrammingLanguageRequest);
	}
	
	@DeleteMapping("/DELETE")
	void delete(int id) {
		programmingLanguageService.delete(id);
	}
    
	@GetMapping("/GetById")
	Optional<GetByIdProgrammingLanguageResponse> getById(int id) {
		return programmingLanguageService.getById(id);
	}
	
	@PutMapping("/PUT")
	void update(int id,UpdateProgrammingLanguageRequest languageRequest) {
		programmingLanguageService.update(id,languageRequest);
	}
	
	
	
	
	
	
	
	
}
