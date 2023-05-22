package kodlama.io.Devs.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="LanguageTechnologies")

public class LanguageTechnology {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="TechnologyName",nullable=false)
	private String technologyName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Language_ID")
	private ProgrammingLanguage language;

	public LanguageTechnology(int id, String technologyName, ProgrammingLanguage language) {
		this.id = id;
		this.technologyName = technologyName;
		this.language = language;
	}

	public LanguageTechnology() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public ProgrammingLanguage getLanguage() {
		return language;
	}

	public void setLanguage(ProgrammingLanguage language) {
		this.language = language;
	}
	
	
	
	
	
	
	
	

}
