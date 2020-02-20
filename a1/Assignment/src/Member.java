import java.util.ArrayList;

class Member {

    private String uName;
    public int fees = 0;
    private ArrayList<Book> books;
    public int difDate;

    public Member(String uName) {
        this.uName = uName;
    }
    public void extendDate(Book b){
        int i = b.getDueDate();
        b.setDueDate(+= 14);
    }
    public Boolean signIn(String n){
        return(this.uName.equals(n));
    }
    public void signUp(String n){
        this.uName = n;
    }

    public String getName() {
        return uName;
    }
    public void setFees(double i){
        fees+= (i * difDate);
    }
}
