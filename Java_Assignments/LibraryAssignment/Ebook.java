package Library;

public class Ebook extends Book{
	double fileSize;
	Ebook(int id,String name,String author,double price,int quantity,double fileSize){
//		super(int id,String name,String author,double price,int quantity); wrong
		super( id, name, author, price,quantity);
		this.fileSize=fileSize;
	}
	
//	void borrowBook() throws BookNotAvailableException{
//		try {
//			if(getQuantity()>0) {
//				setQuantity(getQuantity()-1);
//				System.out.println("Book Borrowed Successfully");
//			}
//			else {
//				throw new BookNotAvailableException("Book is not Available");
//		
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
	
	
	@Override
	void displayBook(){	
		System.out.println("Book ID: "+getId()+"| Name: "
				+getBookName() +"| Author: "+getAuthorName()+"| Price: "+getPrice()+
				"| Quantity: "+getQuantity());
	}
//		System.out.println(" File Size: "+fileSize);
	}



