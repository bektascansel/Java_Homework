import entities.Teacher;
import entities.Course;
import entities.Category;
import java.util.ArrayList;

import business.CategoryManager;
import dataAccess.DataAccessDao;
import dataAccess.HibernateDataAccessDao;
import dataAccess.JdbcDataAccessDao;
import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;


import core.loging.EmailLogger;
import core.loging.FileLogger;
import core.loging.Logger;
public class Main {

	public static void main(String[] args) throws Exception {
		
    Logger[] logger= {new FileLogger(),new EmailLogger()};
    DataAccessDao dataAccessDao=new HibernateDataAccessDao();
    ArrayList<Category> category=new ArrayList<>();
    ArrayList<Course> courses=new ArrayList<>();
    ArrayList<Teacher> teachers=new ArrayList<>();
		
	Teacher teacher1=new Teacher("engin","demirog",35);
	Teacher teacher2=new Teacher("cansu","turan",30);
	Teacher teacher3=new Teacher("zeynep","alakus",35);
	
	
	Course Course1=new Course("java ile programlama",1000,teacher1);
	Course Course2=new Course("pyhton ile programlama",150,teacher2);
	Course Course3=new Course("c# ile programlama",750,teacher3);
	
	Category category1=new Category("java","programlama");
	Category category2=new Category("pyhton","programlama");
	Category category3=new Category("c#","programlama");
	
	
	CategoryManager categoryManager=new CategoryManager(category,dataAccessDao,logger);
	categoryManager.add(category3);
	categoryManager.add(category2);
	categoryManager.add(category1);
	categoryManager.list();

	
	
	
	
	CourseManager courseManager=new CourseManager(courses, dataAccessDao, logger);
	courseManager.add(Course3);
	courseManager.add(Course2);
	courseManager.add(Course1);
	courseManager.list();
	courseManager.delete(Course3);
	courseManager.list();
	
	
	TeacherManager teacherManager=new TeacherManager(teachers, dataAccessDao, logger);
	teacherManager.add(teacher3);
	teacherManager.add(teacher2);
	teacherManager.add(teacher1);
	teacherManager.list();
	teacherManager.delete(teacher3);
	teacherManager.list();
	
	
	
	
	
	
	
	
	
		
		

	}

}
