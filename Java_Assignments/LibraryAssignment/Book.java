package Library;

public class Book {
	
	private int bookId;
	private String bookName;
	private String authorName;
	private double price;
	private int quantity;
	
	Book(int id,String name,String author,double price,int quantity){
		bookId=id;
		bookName=name;
		authorName=author;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId() {
		return bookId;
	}
	public void setId(int bookId) {
		this.bookId=bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	void displayBook() {
		System.out.println("Book ID: "+bookId+"| Name: "
				+bookName+"| Author: "+authorName+"| Price: "+price+
				"| Quantity: "+quantity);
	}
	
	 void borrowBook() throws BookNotAvailableException {
	        if (quantity > 0) {
	            quantity--;
	            System.out.println("Book borrowed successfully");
	        } else {
	            throw new BookNotAvailableException("Book is not available");
	        }
	   }
}
