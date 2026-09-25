public class Book extends TangibleAsset{
<<<<<<< HEAD
	private String isbt;
	public Book(String name,int price,String color,String isbt){
		super(name,price,color);
		this.isbn=isbt;
	}
     public String getIsbt(){return this.isbt;}
}
=======
	private String isbn;
	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
     public String getIsbn(){return this.isbn;}
}
>>>>>>> 5e557a0e2b6d12364661e48439507b74729bcd81
