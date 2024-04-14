public class Author {
    private String authorName;
    private String authorSurname;


    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }

    @Override
    public boolean equals(Object comparisonAuthor) {
        if (this.getClass() != comparisonAuthor.getClass()) {
            return false;
        }
        Author autр = (Author) comparisonAuthor;
        return authorName.equals(autр);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }


}
