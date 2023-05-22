package kodlama.io.Devs.entities.concretes;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ProgrammingLanguages")
public class ProgrammingLanguage {
       
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name="Id")
	   private int id;
	   @Column(name="Name",nullable=false)
	   private String name;
	   
	   @OneToMany(mappedBy = "language",cascade = CascadeType.ALL)
	   private List<LanguageTechnology> technologies;
	   
	   
	   
	   
	public ProgrammingLanguage(int id, String name, List<LanguageTechnology> technologies) {
		this.id = id;
		this.name = name;
		this.technologies = technologies;
	}




	public ProgrammingLanguage() {
		
	}


	
	public ProgrammingLanguage(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	public List<LanguageTechnology> getTechnologies() {
		return technologies;
	}



	public void setTechnologies(List<LanguageTechnology> technologies) {
		this.technologies = technologies;
	}

	
	
	
	
	
	   
	   
	   
	   
	   
	   
	   
	   
}
