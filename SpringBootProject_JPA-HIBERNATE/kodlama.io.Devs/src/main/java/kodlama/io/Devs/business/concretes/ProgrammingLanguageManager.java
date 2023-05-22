package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.programmingLanguageRequest.CreatProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.programmingLanguageRequest.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.business.responses.programmingLanguageResponse.GetAllProgrammingLanguageResponse;
import kodlama.io.Devs.business.responses.programmingLanguageResponse.GetByIdProgrammingLanguageResponse;
import kodlama.io.Devs.dataAccess.abstracts.LanguagesTechnologyRepository;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.LanguageTechnology;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
    
	private ProgrammingLanguageRepository programmingLanguageRespository;
	
	
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRespository,LanguagesTechnologyRepository languagesTechnologyRepository) {
		this.programmingLanguageRespository = programmingLanguageRespository;
	
	}
	

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		
		List<ProgrammingLanguage> languages=programmingLanguageRespository.findAll();
		List<GetAllProgrammingLanguageResponse> getAllProgrammingLanguageResponses=new ArrayList<GetAllProgrammingLanguageResponse>();
		
		for(ProgrammingLanguage language:languages) {
			
			List<String> technologies=new ArrayList<String>();
			
			for(LanguageTechnology languageTechnology:language.getTechnologies()) {
				technologies.add(languageTechnology.getTechnologyName());
			}
			
			
			
			GetAllProgrammingLanguageResponse allProgrammingLanguageResponse=new GetAllProgrammingLanguageResponse();
			allProgrammingLanguageResponse.setId(language.getId());
			allProgrammingLanguageResponse.setName(language.getName());
			allProgrammingLanguageResponse.setTechnologiesNames(technologies);
			
			getAllProgrammingLanguageResponses.add(allProgrammingLanguageResponse);

		}
		
		
		return getAllProgrammingLanguageResponses;
		
	}

	@Override
	public void add(CreatProgrammingLanguageRequest creatProgrammingLanguageRequest) throws Exception {
		List<ProgrammingLanguage> list=programmingLanguageRespository.findAll();
		
		ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
		
		programmingLanguage.setName(creatProgrammingLanguageRequest.getName());
		
		for(ProgrammingLanguage language:list) {
			if(language.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				throw new Exception("Girilen programlama dili sistemde mevcuttur. Lütfen tekrardan deneyiniz");
			}
		}
		
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili ismi girilmedi. Lütfen giriniz.");
		    }
		
		
		programmingLanguageRespository.save(programmingLanguage);
		
		
	}

	
	
	
	@Override
	public void delete(int id){
		programmingLanguageRespository.deleteById(id);
		
	}

	
	
	
	@Override
	public void update(int id,UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		
		
		ProgrammingLanguage programmingLanguage=programmingLanguageRespository.findById(id).get();
		List<LanguageTechnology> technologies=new ArrayList<LanguageTechnology>();
		
		for(LanguageTechnology languageTechnology:programmingLanguage.getTechnologies()) {
			technologies.add(languageTechnology);
		}
		
		programmingLanguage.setId(id);
		programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
		programmingLanguage.setTechnologies(technologies);
	
	   programmingLanguageRespository.saveAndFlush(programmingLanguage);
	    
	
	}

	
	
	@Override
	public Optional<GetByIdProgrammingLanguageResponse> getById(int id) {
		
		ProgrammingLanguage programmingLanguage=programmingLanguageRespository.findById(id).get();
		
		List<String> technologiesName=new ArrayList<String>();
		
		for(LanguageTechnology technology:programmingLanguage.getTechnologies()) {
			technologiesName.add(technology.getTechnologyName());
		}
		
		
		
		GetByIdProgrammingLanguageResponse getByIdProgrammingLanguageResponse=new GetByIdProgrammingLanguageResponse();
		
		getByIdProgrammingLanguageResponse.setId(programmingLanguage.getId());
		getByIdProgrammingLanguageResponse.setName(programmingLanguage.getName());
		getByIdProgrammingLanguageResponse.setTechnologiesName(technologiesName);
		
		return Optional.ofNullable(getByIdProgrammingLanguageResponse);
	}

}
