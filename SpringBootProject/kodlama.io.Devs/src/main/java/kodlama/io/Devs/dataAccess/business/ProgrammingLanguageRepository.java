package kodlama.io.Devs.dataAccess.business;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void update(int id,ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage getById(int id);
	
	
	
	
}
