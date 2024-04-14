public class Book {
    private String bookName;
    private Author author;
    private int yearOfPublication;

    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга " + bookName + ", " + yearOfPublication + ", года выпуска";
    }

    @Override
    public boolean equals(Object comparisonBook) {
        if (this.getClass() != comparisonBook.getClass()) {
            return false;
        }
        Book bookC = (Book) comparisonBook;
        return bookName.equals(bookC);
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
