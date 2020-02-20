import java.util.Scanner;

public class CompSys {

    private static String curDate;
    private static String choice;
    private static String username;
    private static String password;
    private static String title;

    public static void main(String[] args) {
        Library lib = new Library();
        Member mTemp = new Member("Temp");
        Book bTemp = new Book("", "", 0, "");
        Scanner uInput = new Scanner(System.in);

        System.out.println("Welcome to the public library system.");
        System.out.println("Please input the current date (dd/mm/yy):");
        curDate = uInput.nextLine();
        int date = Integer.parseInt(curDate.substring(0, 2));
        int month = Integer.parseInt(curDate.substring(3, 5));
        int year = Integer.parseInt(curDate.substring(6, 8));

        System.out.println("To continue further please select an option below.");
        System.out.println("Are you a (M)ember or (S)taff:");
        choice = uInput.nextLine();

        switch (choice) {
            case "M":
                System.out.println("Are you a registered  member of our Library?(Y/N):");
                choice = uInput.nextLine();
                while (choice != null) {
                    switch (choice.toUpperCase()) {
                        case "Y":
                            System.out.println("Please enter Username:");
                            username = uInput.nextLine();
                            mTemp = lib.searchMember(username);
                            mTemp.signIn(username);
                            lib.memChoice();
                            choice = null;
                            break;
                        case "N":
                            System.out.println("Please enter a user name:");
                            username = uInput.nextLine();
                            mTemp = lib.searchMember(username);
                            if (mTemp.equals(null)) {
                                mTemp.signUp(username);
                            }
                            System.out.println("You are already register!!");
                            break;
                        default:
                            System.out.println("Please enter the proper input.");
                    }
                }
                System.out.println("Please enter your choice:");
                choice = uInput.nextLine();
                while (choice.equals("exit")) {
                    switch (choice.toUpperCase()) {
                        case "A":
                            System.out.println("Please enter the title of the book:");
                            title = uInput.nextLine().replaceAll("\\s", "").toUpperCase();
                            bTemp = lib.searchBook(title);
                            if (!bTemp.equals(null)) {
                                System.out.println("This book is in our registrar. Would you like to take it out?(Y/N):");
                                choice = uInput.nextLine().toUpperCase();
                                do {
                                    if (choice.equals("Y")) {
                                        lib.bookOut(bTemp);

                                        break;
                                    } else if (choice.equals("N")) {
                                        break;
                                    } else
                                        System.out.println("please put the correct input");
                                } while (choice.equals("Y") || choice.equals("N"));
                            } else {
                                System.out.println("The book is not in our system, or you inserted an incorrect input. Please try again.");
                            }
                            break;

                        case "B":
                            System.out.println("PLease enter the title of the returned book:");
                            title = uInput.nextLine();
                            lib.bookIn(lib.searchBook(title));
                            break;
                        case "C":
                            mTemp.extendDate();
                        case "D":
                            mTemp.setFees(0.5);
                    }
                }
            case "S":
                lib.staffChoice();
                while (choice.equals("exit")) {
                    switch (choice.toUpperCase()) {
                        case "A":
                            System.out.println("Please enter the title of the book:");
                            choice = uInput.nextLine();
                            bTemp.setTitle(choice);

                            System.out.println("Please enter the book description:");
                            choice = uInput.nextLine();
                            bTemp.setDescription(choice);

                            System.out.println("Please enter the amount of books in the system:");
                            int i = uInput.nextInt();
                            bTemp.setNumBooksAvail(i);

                            System.out.println("Please enter branch location:");
                            choice = uInput.nextLine();
                            bTemp.setBranchLoc(choice);

                            lib.addNewBook(bTemp);
                            break;

                        case "B":
                            System.out.println("PLease enter the title of the book you wish to update:");
                            title = uInput.nextLine();

                            bTemp = lib.searchBook(title);
                            System.out.println("Please enter the new title of the book:");
                            choice = uInput.nextLine();
                            bTemp.setTitle(choice);

                            System.out.println("Please enter the new book description:");
                            choice = uInput.nextLine();
                            bTemp.setDescription(choice);

                            System.out.println("Please enter the new amount of books in the system:");
                            int num = uInput.nextInt();
                            bTemp.setNumBooksAvail(num);

                            System.out.println("Please enter new branch location:");
                            choice = uInput.nextLine();
                            bTemp.setBranchLoc(choice);

                            break;
                        default:
                            System.out.println("Please put in the proper input");
                    }
                }

        }
    }
}

