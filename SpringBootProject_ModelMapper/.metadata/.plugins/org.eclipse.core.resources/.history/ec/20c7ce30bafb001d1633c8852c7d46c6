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

import kodlama.io.Devs.business.abstracts.LanguagesTechnologyService;
import kodlama.io.Devs.business.requests.languageTechnologyRequest.CreatLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.languageTechnologyRequest.UpdateLanguageTechnologyRequest;
import kodlama.io.Devs.business.responses.languageTechnologyResponse.GetAllLanguageTechnologyResponse;
import kodlama.io.Devs.business.responses.languageTechnologyResponse.GetByIdLanguageTechnologyResponse;

@RestController
@RequestMapping("/api/LanguagesTechnology")
public class LanguagesTechnologyControllers {

	private LanguagesTechnologyService languagesTechnologyService;

	
	@Autowired
	public LanguagesTechnologyControllers(LanguagesTechnologyService languagesTechnologyService) {
		this.languagesTechnologyService = languagesTechnologyService;
	}

    @GetMapping("/getAll")
	List<GetAllLanguageTechnologyResponse> getAll() {
		return languagesTechnologyService.getAll();
	}
	
    
	@PostMapping("/Post")
	void Add(CreatLanguageTechnologyRequest creatLanguageTechnologyRequest) {
		languagesTechnologyService.add(creatLanguageTechnologyRequest);
	}
	
	@DeleteMapping("/Delete")
	void delete(int id) {
		languagesTechnologyService.delete(id);
	}
    
	@GetMapping("/getById")
	Optional<GetByIdLanguageTechnologyResponse> getById(int id) {
		return languagesTechnologyService.getById(id);
	}
	
	@PutMapping("/Update")
	void update(int id,UpdateLanguageTechnologyRequest languageTechnologyRequest) {
		languagesTechnologyService.update(id,languageTechnologyRequest);
	}
	
	
	
}
