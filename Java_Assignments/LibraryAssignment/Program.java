package Library;
import java.util.*;
import java.util.ArrayList;




public class Program {

	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<Book>();
		Book b1=new Book(101,"Java","James",500,3);
		Book b2=new Book(102,"Python","Guido",600,2);
		Ebook e1 = new Ebook(103, "C++", "Bjarne", 550, 1, 10.5);
		Ebook e2 = new Ebook(104, "Java", "James", 500, 2, 15.5);
		Book b3 = new Book(105, "Python", "Guido", 600, 3);
		Ebook e3 = new Ebook(106, "Spring", "James", 700, 0, 20.0);
		
		books.add(b1);
		books.add(b2);
		books.add(e1);
		books.add(e2);
		books.add(b3);
		books.add(e3);
		
		for (Book book : books) {
		    book.displayBook();
		}
		System.out.println();
		Comparator<Book> c=new Comparator<Book>() {
			public int compare(Book b1,Book b2) {
				return b1.getBookName().compareTo(b2.getBookName());
			}
		};
		Collections.sort(books,c);
		System.out.println("Sorted Books:");
		for (Book book : books) {
			
		    System.out.println(book.getBookName());
		}
		System.out.println();
		
		
		System.out.println("Author Frequency:");
		LinkedHashMap<String, Integer> authorMap =new LinkedHashMap<String, Integer>();
			for (Book book : books) {
			    String author = book.getAuthorName();
			    if (authorMap.containsKey(author)) {
			        authorMap.put(author, authorMap.get(author) + 1);
			    }
			    else {
			        authorMap.put(author, 1);
			    }
			}
			for (Map.Entry<String, Integer> entry : authorMap.entrySet()) {
			    System.out.println(entry.getKey() + " " + entry.getValue());
			}	
			System.out.println();
			
			
			
			System.out.println("Most Frequent Author");
			int maxCount = 0;
	        // Find maximum count
	        for (Map.Entry<String, Integer> entry : authorMap.entrySet()) {

	            if (entry.getValue() > maxCount) {
	                maxCount = entry.getValue();
	            }
	        }
	        // Print all books having maximum count
	        for (Map.Entry<String, Integer> entry : authorMap.entrySet()) {

	            if (entry.getValue() == maxCount) {
	                System.out.println(entry.getKey() + " " + entry.getValue());
	            }
	        }
	        
	        System.out.println();
	        System.out.println("Borrowing Book:");

	        try {
	            books.get(0).borrowBook();

	            System.out.println("Final Quantity: "+ books.get(0).getQuantity());
	        }
	        catch (BookNotAvailableException e) {
	            System.out.println(e.getMessage());
	        }
	        
	}	
}

