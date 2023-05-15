package entities;

public class Category {
      
	private String categoryName;
	private String type;
	
	
	public Category() {
		
	}


	public Category(String categoryName, String type) {
		super();
		this.categoryName = categoryName;
		this.type = type;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
}
