package firstjava;

public class LibraryBook {
	static String libraryName="Vcube";
	static String librarianName="bhAAi";
	
	
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	
	void displayBookDetails() {
		System.out.println("*************Books Details******************");
		System.out.println("BookId is:-"+bookId);
		System.out.println("BookTitle is:-"+bookTitle);
		System.out.println("AuthorName is:-"+authorName);
		System.out.println("Available copies is:-"+availableCopies);
	}
	
	void displayLibraryDetails() {
		System.out.println("***********Library Details*************");
		System.out.println("LibraryName is :-"+libraryName);
		System.out.println("LibrarianName is :-"+librarianName);
	}
	void changeLibrarianName() {
		librarianName="boss";
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		//This is Book no-1
		LibraryBook Book1=new LibraryBook();
		Book1.bookId=101;
		Book1.bookTitle="The paradise";
		Book1.authorName="Srikanth";
		Book1.availableCopies=25;
		
		//This is Book no-2
		
		LibraryBook Book2=new LibraryBook();
		Book2.bookId=102;
		Book2.bookTitle="Kalki";
		Book2.authorName="NagaAshwin";
		Book2.availableCopies=35;
		
		//This is Book no-3
		
		LibraryBook Book3=new LibraryBook();
		Book3.bookId=103;
		Book3.bookTitle="GameChanger";
		Book3.authorName="Shankar";
		Book3.availableCopies=135;
		
		//This is Book no-4
		LibraryBook Book4=new LibraryBook();
		Book4.bookId=104;
		Book4.bookTitle="The RajaSaab";
		Book4.authorName="MavricMaruthi";
		Book4.availableCopies=69;
		
		
		//Method calling
		Book1.displayLibraryDetails();
	    System.out.println("                ");
		Book1.displayBookDetails();
        System.out.println("                ");
        Book2.displayBookDetails();
        System.out.println("                ");
        Book3.displayBookDetails();
        System.out.println("                ");
        Book4.displayBookDetails();
        System.out.println("                ");
        Book4.changeLibrarianName();
        Book4.displayLibraryDetails();

		System.out.println("Main method ended");

		

	}

}
