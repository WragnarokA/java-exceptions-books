package Exceptions;

public class Book {
    private String title;
    private int numPages;
    private String author;
    private String publisher;

    public Book(String title, int numPages, String author, String publisher) {
        setTitle(title);
        setNumPages(numPages);
        setAuthor(author);
        setPublisher(publisher);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Il titolo non può essere vuoto.");
        }
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        if (numPages <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di zero.");
        }
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("L'autore non può essere vuoto.");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher == null || publisher.trim().isEmpty()) {
            throw new IllegalArgumentException("L'editore non può essere vuoto.");
        }
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Titolo: " + title + ", Pagine: " + numPages + ", Autore: " + author + ", Editore: " + publisher;
    }
}
