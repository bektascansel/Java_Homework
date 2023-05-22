package kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Devs.entities.concretes.LanguageTechnology;

public interface LanguagesTechnologyRepository extends JpaRepository<LanguageTechnology, Integer>{

}
