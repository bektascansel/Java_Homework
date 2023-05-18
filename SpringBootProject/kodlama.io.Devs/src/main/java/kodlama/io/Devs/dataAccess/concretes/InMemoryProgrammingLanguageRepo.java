package kodlama.io.Devs.dataAccess.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import kodlama.io.Devs.dataAccess.business.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepo implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> languages;
	
	public InMemoryProgrammingLanguageRepo() {
		languages=new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"c#"));
		languages.add(new ProgrammingLanguage(2,"java"));
		languages.add(new ProgrammingLanguage(3,"pyhton"));
		languages.add(new ProgrammingLanguage(4,"php"));
		languages.add(new ProgrammingLanguage(5,"javascript"));
		
	}
	
	
	
	
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		
		languages.add(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		languages.remove(id-1);
	
	}

	
	@Override
	public void update(int id,ProgrammingLanguage programmingLanguage) {
		
		languages.set(id, programmingLanguage);
		//languages.get(programmingLanguage.getId()).setName(programmingLanguage.getName());
	    
	}

	public ProgrammingLanguage getById(int id) {
	
		return languages.get(id-1);
	}

}
