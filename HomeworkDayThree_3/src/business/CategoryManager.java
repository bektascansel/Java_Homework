package business;

import entities.Category;
import java.util.ArrayList;

import core.loging.Logger;
import dataAccess.DataAccessDao;

public class CategoryManager {
    private ArrayList<Category>  categoryList;
    private DataAccessDao dataAccessDao;
    private Logger[] loggers;
    
    
    
	
	public CategoryManager( ArrayList<Category> categoryList, DataAccessDao dataAccessDao,
			Logger [] loggers) {
		super();
		
		this.categoryList = categoryList;
		this.dataAccessDao = dataAccessDao;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		
		for (Category categorys : categoryList) {
			if(categorys.getCategoryName()== category.getCategoryName()) {
				throw new Exception("Kategori ismi aynı olamaz.");
			}
		}
		
		
		
			categoryList.add(category);
			dataAccessDao.add();
			for(Logger log:loggers) {
				log.log();
			}
		
		
   }
		
	

	
	public void list() {
		
		for(Category category:categoryList) {
			System.out.println(category.getCategoryName());
		}
		
		dataAccessDao.list();
		
	}

	

	

}
