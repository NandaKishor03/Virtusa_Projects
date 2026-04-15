import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Transaction {
    private static int Counter = 1;
    private int transactionId;
    private int bookId;
    private int userId;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private long fine;
    
    public Transaction(int bookId, int userId, LocalDate issueDate){
        this.transactionId = Counter++;
        this.bookId = bookId;
        this.userId = userId;
        this.issueDate = issueDate;
        this.returnDate = null;
        this.fine = 0;
    }

    public int getBookId(){
        return bookId;
    }

    public int getUserId(){
        return userId;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }

    public long getFine(){
        return fine;
    }

    public void setReturnDate(LocalDate returnDate){
        this.returnDate = returnDate;
    }

    public void calculateFine(){
        if (returnDate != null){
            long daysLate = ChronoUnit.DAYS.between(issueDate, returnDate) - 14;
            fine = daysLate > 0 ? daysLate * 5 : 0;
        }
    }

    public String toString(){
        return "Txn: " + transactionId + 
               " | Book Id: " + bookId +
               " | User Id: " + userId + 
               " | Issue Date: " + issueDate +
               " | Return Date: " + (returnDate != null ? returnDate : "Not Returned Yet " + " | Fine: " + fine);  
    }
}
