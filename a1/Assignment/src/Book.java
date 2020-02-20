public class Book {

    private String title;
    private String branchLoc;
    private String description;
    private int numBooksAvail;
    private String dueDate;
    private int status = 1;

    public Book(String title, String description, int numBooksAvail, String branchLoc) {
        this.title = title;
        this.description = description;
        this.numBooksAvail = numBooksAvail;
        this.branchLoc = branchLoc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", numBooksAvail=" + numBooksAvail +
                ", branchLoc='" + branchLoc + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumBooksAvail(int numBooksAvail) {
        this.numBooksAvail = numBooksAvail;
    }

    public void setBranchLoc(String branchLoc) {
        this.branchLoc = branchLoc;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }
}
