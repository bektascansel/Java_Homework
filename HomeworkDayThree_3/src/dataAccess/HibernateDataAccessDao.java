package dataAccess;

public class HibernateDataAccessDao implements DataAccessDao{

	@Override
	public void add() {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Hibernate ile veritabanına silindi");
		
	}

	@Override
	public void list() {
		System.out.println("Hibernate ile veritabanına listelendi");
		
	}

}
