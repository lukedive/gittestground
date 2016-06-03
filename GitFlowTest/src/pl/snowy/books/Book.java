package pl.snowy.books;

public class Book {

	private String ISBN;

	private String title;

	public Book(String iSBN, String title) {
		super();
		ISBN = iSBN;
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + "]";
	}

}
