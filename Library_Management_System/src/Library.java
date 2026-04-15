import java.util.ArrayList;
import java.time.LocalDate;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Transaction> transactions;

    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void deleteBook(int bookId){
        Book book = findBook(bookId);
        if (book != null){
            books.remove(book);
            System.out.println("Book Deleted Successfully");
        } else {
            System.out.println("Book not Found");
        }
    }

    public void updateBook(int bookId, String newTitle, String newAuthor){
        Book book = findBook(bookId);
        if (book != null){
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            System.out.println("Book Updated Successfully");
        } else {
            System.out.println("Book not Found - To Update");
        }
    }

    public void registerUser(User user){
        users.add(user);
        System.out.println("User Registered Successfully");
    }

    public void deleteUser(int userId){
        User user = findUser(userId);
        if (user != null){
            users.remove(user);
            System.out.println("User Deleted Successfully");
        } else {
            System.out.println("User not Found - To Delete");
        }
    }

    public void issueBook(int bookId, int userId){
        Book book = findBook(bookId);
        User user = findUser(userId);
        if (book != null && user != null && !book.isIssued()){
            book.setIssued(true);
            transactions.add(new Transaction(bookId, userId, LocalDate.now()));
            System.out.println("Book Issued Successfully");
        } else if (book == null){
            System.out.println("Book not Found - Invalid Book Id");
        } else if (user == null){
            System.out.println("User not Found - Invalid User Id");
        } else {
            System.out.println("Book is already Issued - Cannot Issue");
        }
    }

    public void returnBook(int bookId, int userId){
        Book book = findBook(bookId);
        User user = findUser(userId);
        Transaction txn = findTransaction(bookId, userId);
        if (book != null && user != null && txn != null){
            book.setIssued(false);
            txn.setReturnDate(LocalDate.now());
            txn.calculateFine();
            System.out.println("Book Returned Successfully | Fine: " + txn.getFine());
        } else if (book == null){
            System.out.println("Book not found - Invalid Book Id");
        } else if (user == null){
            System.out.println("User not Found - Invalid user Id");
        } else{
            System.out.println("No active transaction Found for this Book and User - Cannot Return");
        }
    }

    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("No Books Available in the Library");
        } else {
            System.out.println("Books in the Library: ");
            for (Book book : books){
                System.out.println(book);
            }
        }
    }

    public void displayUsers(){
        if (users.isEmpty()){
            System.out.println("No Users Registered in the Library");
        } else {
            System.out.println("Registered Users: ");
            for (User user : users){
                System.out.println(user);
            }
        }
    }

    public void displayTransactions(){
        if (transactions.isEmpty()){
            System.out.println("No Transactions Found");
        } else {
            System.out.println("Transactions: ");
            for (Transaction txn : transactions){
                System.out.println(txn);
            }
        }
    }

    public Book findBook(int bookId){
        for (Book book :books){
            if (book.getBookId() == bookId){
                return book;
            }
        }
        return null;
    }

    public User findUser(int userId){
        for(User user : users){
            if (user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }

    public Transaction findTransaction(int bookId, int userId){
        for (Transaction txn : transactions){
            if (txn.getBookId() == bookId && txn.getUserId() == userId && txn.getReturnDate() == null){
                return txn;
            }
        }
        return null;
    }
}
