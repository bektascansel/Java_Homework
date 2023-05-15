package business;

import java.util.ArrayList;

import core.loging.Logger;
import dataAccess.DataAccessDao;
import entities.Category;
import entities.Course;

public class CourseManager  {
    private ArrayList<Course> courses;
    private DataAccessDao dataAccessDao;
    private Logger[] loggers;
    
    
    
	public CourseManager(ArrayList<Course> courses, DataAccessDao dataAccessDao,Logger [] loggers) {
		this.courses = courses;
		this.dataAccessDao = dataAccessDao;
		this.loggers = loggers;
	}

	
	
	public void add(Course course) throws Exception {
		for (Course coursee : courses) {
			if(coursee.getCourseName()== course.getCourseName()) {
				throw new Exception("Kurs  ismi aynı olamaz.");
			}
		}
		
		for (Course coursee : courses) {
			if(coursee.getPrice()== 0) {
				throw new Exception("Kurs  ücreti 0 olamaz");
			}
		}
		 
			courses.add(course);
			dataAccessDao.add();
			for(Logger log:loggers) {
				log.log();
			}
		
	}
	
	
	

	
	public void list() {
		for(Course course:courses) {
			System.out.println(course.getCourseName());
		}
		
		dataAccessDao.list();
	}
	
	
	
	
	public void delete(Course course) {
		 
				courses.remove(course);
			    dataAccessDao.delete();
			    for(Logger log:loggers) {
					log.log();
				}
			
		
		
		
		
		
		
	}
	
	
	
}
