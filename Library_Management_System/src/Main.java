import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do{
            System.out.println("\n ----- Library Management System ----- ");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Update Book");
            System.out.println("4. Register User");
            System.out.println("5. Delete User");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Display Books");
            System.out.println("9. Display Users");
            System.out.println("10. Display Transactions");
            System.out.println(|"11. Search Book: ");
            System.out.println("0. Exit");

            System.out.print("\nEnter your Choice: ");

            try{
                choice = sc.nextInt();
            } catch (Exception e){
                System.out.println("Invalid Choice - PLease Enter a Valid Number");
                sc.nextLine();
                choice  = -1;
                continue;
            }

            int bookId, userId;
            String title, author, newTitle, newAuthor, username;

            switch(choice){
                case 1:
                    System.out.print("\nEnter Book Id: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    author = sc.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;

                case 2:
                    try{
                        System.out.print("\nEnter Book Id to Delete Book: ");
                        bookId = sc.nextInt();
                        library.deleteBook(bookId);
                    } catch (Exception e){
                        System.out.print("Invalid Book Id: " + e.getMessage());
                        sc.nextLine();
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Book Id to Update Book: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Title Name: ");
                    newTitle = sc.nextLine();
                    System.out.print("Enter New Author Name: ");
                    newAuthor = sc.nextLine();
                    library.updateBook(bookId, newTitle, newAuthor);
                    break;

                case 4:
                    System.out.print("\nEnter User Id: ");
                    userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Username: ");
                    username = sc.nextLine();
                    library.registerUser(new User(userId, username));
                    break;

                case 5:
                    System.out.print("\nEnter User Id to Delete User: ");
                    userId = sc.nextInt();
                    library.deleteUser(userId);
                    break;

                case 6:
                    System.out.print("\nEnter Book Id to Issue: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Id to Issue Book: ");
                    userId = sc.nextInt();
                    sc.nextLine();
                    library.issueBook(bookId, userId);
                    break;
                    
                case 7:
                    System.out.print("\nEnter Book Id to Return: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Id to Return Book: ");
                    userId = sc.nextInt();
                    sc.nextLine();
                    library.returnBook(bookId, userId);
                    break;

                case 8:
                    library.displayBooks();
                    break;

                case 9:
                    library.displayUsers();
                    break;

                case 10:
                    library.displayTransactions();
                    break;
                
                case 11:
                    sc.nextLine(); 
                    System.out.print("\nEnter keyword (title/author): ");
                    String keyword = sc.nextLine();
                    library.searchBook(keyword);
                    break;

                case 0:
                    System.out.println("\nExiting the System. Thank you!! ");
                    break;
                
                default:
                    System.out.println("\nInvalid Choice - Please Try Again");


            }

        } while(choice != 0);

        sc.close();
    }
}
