package business;

import java.util.ArrayList;

import core.loging.Logger;
import dataAccess.DataAccessDao;
import entities.Course;
import entities.Teacher;

public class TeacherManager {

	  private ArrayList<Teacher> teachers;
	    private DataAccessDao dataAccessDao;
	    private Logger[] loggers;
	    
	    
	    
	    
		public TeacherManager(ArrayList<Teacher> teachers, DataAccessDao dataAccessDao, Logger[] loggers) {
			this.teachers = teachers;
			this.dataAccessDao = dataAccessDao;
			this.loggers = loggers;
		}
		
		
		public void add(Teacher teacher) throws Exception {
			     teachers.add(teacher);
				dataAccessDao.add();
				for(Logger log:loggers) {
					log.log();
				}
		}
		
		
		

		
		public void list() {
			for(Teacher teacher:teachers) {
				System.out.println(teacher.getName());
			}
			
			dataAccessDao.list();
		}
		
		
		
		
		public void delete(Teacher teacher) {
					teachers.remove(teacher);
				    dataAccessDao.delete();
				    for(Logger log:loggers) {
						log.log();
					}
	}
	
		
			
}
