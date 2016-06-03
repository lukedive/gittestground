package pl.snowy.books;

public class Book {

	private String ISBN;

	private String title;

	private String author;

	public Book(String isbn, String title, String author) {
		super();
		this.ISBN = isbn;
		this.author = author;
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String isbn) {
		ISBN = isbn;
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

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + "]";
	}

}
