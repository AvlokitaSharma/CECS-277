//Avlokita Sharma
//Practice2
//Decemeber152021

// Book..
public class Book {

	// Attributes..
	protected String title;
	protected String author;
	protected String publisher;
	protected String publicationDate;
	
	// Constructor..
	public Book(String title, String author, String publisher,
			String publicationDate) {
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	
	}

	// method..
	public void printInfo() {
		
		System.out.println("Title: " + title);
		System.out.println("Auhtor: " + author);
		System.out.println("Publisher: " + publisher);
		System.out.println("Publication Date: " + publicationDate);
		
	}
	
	// Getter and Setters..
	public String getTitle() {
		
		return title;
		
	}

	public String getAuthor() {
		
		return author;
		
	}

	public String getPublisher() {
		
		return publisher;
		
	}

	public String getPublicationDate() {
		
		return publicationDate;
		
	}

	public void setTitle(String title) {
		
		this.title = title;
		
	}

	public void setAuthor(String author) {
		
		this.author = author;
		
	}

	public void setPublisher(String publisher) {
		
		this.publisher = publisher;
		
	}

	public void setPublicationDate(String publicationDate) {
		
		this.publicationDate = publicationDate;
		
	}
	
}
