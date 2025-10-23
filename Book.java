public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

     //constructor    
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

  
// getters and setters
    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public boolean isIssued() {
		return isIssued;
	}

    
    //Error fix Method
    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }
    

	@Override
    public String toString() {
        return "Book ID: " + id + " | Title: " + title + " | Author: " + author + " | Issued: " + (isIssued ? "Yes" : "No");
    }
}
