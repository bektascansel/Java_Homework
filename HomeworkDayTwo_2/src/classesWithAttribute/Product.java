package classesWithAttribute;

public class Product {
	
	
	public Product(int id,String name,String description,double price,int stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		/*setId(id);
		set_name(name);
		set_description(description);
		set_price(price);
		set_stockAmount(stockAmount);*/
		
		this._id=id;
		this._description=description;
		this._name=name;
		this._price=price;
		this._stockAmount=stockAmount;
		
	}
	
	
	public Product() {
		
	}
	
	
	
	//attribute 
	private int _id;
	private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    
    public int getId() {
    	return _id;
    }
    
    public void setId(int id) {
    	_id=id;
    }

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		_name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		_description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		_price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		_stockAmount = _stockAmount;
	}
    
    
    
}
