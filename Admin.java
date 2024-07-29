import  java.util.Scanner;

public class Admin {
    private String Username;
    private String Password;

    private final Scanner scanner = new Scanner(System.in);

    public Admin(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }
    //get method
    public String GetUsername(){
        return Username;
    }

    public String GetPassword(){
        return Password;
    }

    //set method
    public void SetUsername(String Username){
        this.Username = Username;
    }

    public void SetPassword(String Password){
        this.Password = Password;
    }
    // username password gethering
    public void UsernamePassword(){
        
        System.out.println("Enter your Username : ");
        this.Username = scanner.nextLine();
        System.out.println("Enter your Password : ");
        this.Password = scanner.nextLine();

        // admin username password checker
        if ("admin".equals(this.Username) & "admin".equals(this.Password))
            Bus.ShowMenu();
        //invalid username password
        else{
            System.out.println("You Enter usename or password is wrong!!!");
            UsernamePassword();
        }
    }
}
