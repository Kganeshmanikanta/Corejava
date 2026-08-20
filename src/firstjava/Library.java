package firstjava;

public class Library {
	int book_id;
	String bookTitle;
	String authorName;
	int availableCopies;
	static String librarianName="Luffy";
	static String libraryName="LaughTale";
	
	void display() {
		System.out.println("Book_id:"+book_id);
		System.out.println("BookTitle:"+bookTitle);
		System.out.println("AuthorName:"+authorName);
		System.out.println("Available Copies:"+availableCopies);
		System.out.println("Library Name:"+libraryName);
		System.out.println("Librarian Name:"+librarianName);
	}
	void issueBook() {
		System.out.print("Book has been Issued and the remaining objects are:");
		availableCopies --;
		System.out.println(+availableCopies);
	}
	void changeName() {
		librarianName="Nagato";
		
	}

	public static void main(String[] args) {
		Library book1=new Library();
		book1.book_id=101;
		book1.bookTitle="Seven Deadly Sins";
		book1.authorName="Kishimoto";
		book1.availableCopies=23;
		book1.display();
		book1.issueBook();
		book1.issueBook();

		
		System.out.println("*************************************");
		Library book2=new Library();
		book2.book_id=102;
		book2.bookTitle="Bleach:The Thousands Years War";
		book2.authorName="Kishimoto";
		book2.availableCopies=13;
		book2.changeName();
		book2.display();
		book2.issueBook();

	}

}
