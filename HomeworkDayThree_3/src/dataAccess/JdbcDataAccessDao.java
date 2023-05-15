package dataAccess;

public class JdbcDataAccessDao implements DataAccessDao{

	@Override
	public void add() {
		System.out.println("jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("jdbc ile veritabanına silindi");
		
	}

	@Override
	public void list() {
		System.out.println("jdbc ile veritabanına listelendi");
		
	}

}
