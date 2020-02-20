import java.util.ArrayList;
import java.lang.System;

public class Library {

    private ArrayList <Book> library;
    private ArrayList <Member> member;
    private ArrayList <Member> waitlist;

    public Library() {

    }

    public ArrayList<Book> getLibrary() {
        return library;
    }
    public ArrayList<Member> getMember() {
        return member;
    }
    public ArrayList<Member> getWaitlist() {
        return waitlist;
    }
    public void staffChoice(){
        System.out.println("This is the Staff menu. Please select one of the following choices:\n");
        System.out.println("(A)Add new book");
        System.out.println("(B)Update book");
    }
    public void memChoice(){
        System.out.println("Welcome to our Library. Please select one of the following choices:\n");
        System.out.println("(A)Search for a book");
        System.out.println("(B)Return a book");
        System.out.println("(C)Extend due date");
        System.out.println("(D)Pay fees");

    }

    public Member searchMember(String name){
        for(int i=0;i<this.getMember().size();i++){
            if (this.getMember().get(i).getName().equals(name)){
                return this.getMember().get(i);
            }
        }
        return null;
    }
   public Book searchBook(String t){
        for(int i = 0; i < this.getLibrary().size();i++)
            if(this.getLibrary().get(i).getTitle().equals(t)){
                return this.getLibrary().get(i);
        }
       return null;
    }
    public void searchWait(String name, Library lib){
        for(int i=0;i<lib.getWaitlist().size();i++){
            if (lib.getWaitlist().get(i).getName().equals(name)){
                System.out.println("Your are still on the waitlist.Spot:" + (i+1));
            }
        }
        System.out.println("You are not on the waitlist.");
    }
    public void waitRemove(Member m){
        this.getWaitlist().remove(m);
    }

    public void bookOut(Book b){
        for(int i = 0; i < this.getLibrary().size();i++)
            if(this.getLibrary().get(i).equals(b)){
                this.getLibrary().get(i).setStatus(0);
                System.out.println(this.getLibrary().get(i).getTitle() + "has been taken out");
            }
        System.out.println("The book you requested is not available.");
    }
    public void bookIn(Book b){
        for(int i = 0; i < this.getLibrary().size();i++)
            if(this.getLibrary().get(i).equals(b)){
                this.getLibrary().get(i).setStatus(1);
                System.out.println(this.getLibrary().get(i).getTitle() + "has been returned. Thank you.");
            }
        System.out.println("The book you returned is not part of the library's records.");
    }

    public void addNewBook(Book b){
        this.getLibrary().add(b);
    }
    public int addFee(Member m){
        return m.fees += 0.5;
    }
    public void overDue(){
        System.out.println("Your book is overdue.");
    }

}
