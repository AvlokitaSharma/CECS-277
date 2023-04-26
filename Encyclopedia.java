//Avlokita Sharma
//Practice2
//Decemeber152021

// Encyclopedia..
public class Encyclopedia extends Book {

	// Attributes..
	private int edition;
	private int numVolumes;
	
	// Constructor..
	public Encyclopedia(String title, String author, String publisher,
			String publicationDate, int edition, int numVolumes) {
		
		super(title, author, publisher, publicationDate);
		
		this.edition = edition;
		this.numVolumes = numVolumes;
	
	}

	// method..
	@Override
	public void printInfo() {
	
		super.printInfo();
		System.out.println("Edition: " + edition);
		System.out.println("Num Volumes: " + numVolumes);
		
	}
	
	// Getter and setters..
	public int getEdition() {
		
		return edition;
		
	}

	public int getNumVolumes() {
		
		return numVolumes;
		
	}

	public void setEdition(int edition) {
		
		this.edition = edition;
		
	}

	public void setNumVolumes(int numVolumes) {
		
		this.numVolumes = numVolumes;
		
	}
	
}
