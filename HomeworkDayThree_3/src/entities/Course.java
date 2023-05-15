package entities;

public class Course {
	
	private String courseName;
	private double price;
	Teacher teacher;
	
	public Course() {
		
	}

	public Course(String courseName, double price, Teacher teacher) {
		
		this.courseName = courseName;
		this.price = price;
		this.teacher = teacher;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
	

}
