
public class Customer {
    private String CustomerName;
    private String MobileNumber;
    private String Email_ID;
    private String City;
    private Integer Age;
    private String Username;
    private String Password;

    private static final Reuse reuse = new Reuse();

    public Customer(String CustomerName,String MobileNumber,String Email_ID,String City,Integer Age,String Username,String Password){
        this.CustomerName = CustomerName;
        this.MobileNumber = MobileNumber;
        this.Email_ID = Email_ID;
        this.City = City;
        this.Age = Age;
        this.Username = Username;
        this.Password = Password;
    }
    //get set method
    public String GetCustomerName(){
        return CustomerName;        
    }
    public void SetCustomerName(String CustomerName){
        this.CustomerName = CustomerName;     
    }

    public String GetMobileNumber(){
        return MobileNumber;        
    }
    public void SetMobileNumber(String MobileNumber){
        this.MobileNumber = MobileNumber;     
    }

    public String GetEmail_ID(){
        return Email_ID;        
    }
    public void SetEmail_ID(String Email_ID){
        this.Email_ID = Email_ID;     
    }

    public String GetUsername(){
        return Username;        
    }
    public void SetUsername(String Username){
        this.Username = Username;
    }

    public String GetPassword(){
        return Password;        
    }
    public void SetPassword(String Password){
        this.Password = Password;
    }
    public String GetCity(){
        return City;        
    }
    public void SetCity(String City){
        this.City = City;
    }

    public Integer GetAge(){
        return Age;        
    }
    public void SetAge(Integer Age){
        this.Age = Age;     
    }
    
    public void RegistationCustomer(){
        System.out.println("Please enter your Registation Details \nEnter your Full Name : ");
        this.CustomerName = reuse.ScannerSet().nextLine();


    }

}