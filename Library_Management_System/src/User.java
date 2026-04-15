import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate registerDate;
    
    public User(int id, String name){
        this.id = id;
        this.name = name;
        this.registerDate = LocalDate.now();
    }

    public int getUserId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public LocalDate getRegisterDate(){
        return registerDate;
    }

    public String toString(){
        return "User Id: " + id + " | Name: " + name + " | Register Date: " + registerDate;
    }
    
}
