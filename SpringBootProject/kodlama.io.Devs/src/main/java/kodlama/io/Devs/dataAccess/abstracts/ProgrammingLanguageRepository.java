package kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{

	
	//JpaREporsitory kullanıldığı için bu metotları yazmamıza gerek yoktur. çünkü spring arkada herşeyi sağlamaktadır
//	List<ProgrammingLanguage> getAll();
//	void add(ProgrammingLanguage programmingLanguage);
//	void delete(int id);
//	void update(int id,ProgrammingLanguage programmingLanguage);
//	ProgrammingLanguage getById(int id);
	
	
	
	
}
