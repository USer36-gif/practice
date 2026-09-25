public class Book extends TangibleAsset{
	private String isbt;
	public Book(String name,int price,String color,String isbt){
		super(name,price,color);
		this.isbn=isbt;
	}
     public String getIsbn(){return this.isbt;}
}