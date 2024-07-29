
import java.util.ArrayList;


public class Admin {
    private String Username;
    private String Password;

    private final Reuse reuse = new Reuse();

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
        
        String[] enterLogin = {"Enter your Username : ","Enter your Password : "};
        ArrayList <String> EnterLogin = reuse.scannerGet(enterLogin);
        EnterLogin.set(0, this.Username);
        EnterLogin.set(1, this.Password);
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
