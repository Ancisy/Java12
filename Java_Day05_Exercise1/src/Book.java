public class Book {
    private int bookIndex;
    private String bookName;
    private String bookCategory;
    private String bookCampany;
    private int bookYear;

    public Book() {
    }

    public Book(int bookIndex, String bookName, String bookCategory, String bookCampany, int bookYear) {
        this.bookIndex = bookIndex;
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookCampany = bookCampany;
        this.bookYear = bookYear;
    }

    public int getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(int bookIndex) {
        this.bookIndex = bookIndex;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookCampany() {
        return bookCampany;
    }

    public void setBookCampany(String bookCampany) {
        this.bookCampany = bookCampany;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}
