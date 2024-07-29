import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bus {
    // Create method variables for full class using
    private String BusNumber;
    private int TotalSeate;
    private String StatingPoint;
    private String EndingPoint;
    private LocalTime StartingTime;
    private double Fare;
    private List<ReservationEntry> Reservation;
    private Queue WaitingList;
    //create object
    private static Scanner scanner = new Scanner(System.in);
    private static Reuse reuse = new Reuse();

    public Bus(){
        this.Reservation = new ArrayList<>();
        this.WaitingList = new Queue();
    }
    public Bus(String BusNumber, int TotalSeate,String StatingPoint, String EndingPoint,LocalTime StartingTime, double Fare){
        this.BusNumber = BusNumber;
        this.TotalSeate = TotalSeate;
        this.StartingTime = StartingTime;
        this.EndingPoint = EndingPoint;
        this.StatingPoint = StatingPoint;
        this.Fare = Fare;
        this.Reservation = new ArrayList<>();
        this.WaitingList = new Queue();

    }

    //getter setter method
    public String GetBusNumber(){
        return BusNumber;
    }
    public void SetBusNumber(String BusNumber){
        this.BusNumber = BusNumber;
    }


    public int GetTotalSeate(){
        return TotalSeate;
    }
    public void SetTotalSeate(int TotalSeate){
        this.TotalSeate = TotalSeate;
    }


    public LocalTime GetStartingTime(){
        return StartingTime;
    }
    public void SetStartingTime(LocalTime StartingTime){
        this.StartingTime = StartingTime;
    }

    public String GetStatingPoint(){
        return EndingPoint;
    }
    public void SetStatingPoint(String StatingPoint){
        this.StatingPoint = StatingPoint;
    }

    public String GetEndingPoint(){
        return EndingPoint;
    }
    public void SetEndingPoint(String EndingPoint){
        this.EndingPoint = EndingPoint;
    }

    public double GetFare(){
        return Fare;
    }
    public void SetFare(double Fare){
        this.Fare = Fare;
    }

    public List<ReservationEntry> GetReservation(){
        return Reservation;
    }
    public Queue GetWaitingList(){
        return WaitingList;
    }

    public static void ShowMenu(){
        Bus bus = new Bus();

        boolean exit = false;
        while (!exit){
            System.out.println("\nHome > Bus Management \n================== \n1. Insert Bus \n2. Update Bus \n3. Delete Bus \n4. View All Buses \n5. Search Buses by Route and Time \n6. Reserve Bus \n7. Cancel Reservation \n8. Promote from Waiting List \n9. Exit \nEnter your choice: ");
            try{
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        bus.InsertBus();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    
                    
                }
                
            }
            catch(Exception e){
                System.err.println(e);
            }
        }
    }
   
    public void InsertBus(){
        try {
            String string = null;
            String[] InsertString = {"Enter your bus Number : ", "Enter the Total seat for bus : ",
                "Whice palce you have to satrt : ", "Whice palce you have to End :", "What are the starting time (HH:MM) 24 Hour Formate : ", 
                "how much fare : "};
            ArrayList<String> InsertedData = reuse.scannerGet(InsertString);
            InsertedData.set(0,this.BusNumber);
            InsertedData.set(1,string);
            this.TotalSeate = Integer.parseInt(string);
            InsertedData.set(2,this.StatingPoint);
            InsertedData.set(3,this.EndingPoint);
            InsertedData.set(4,string);
            this.StartingTime = LocalTime.parse(string);
            InsertedData.set(5,string);
            this.Fare = Double.parseDouble(string);
            System.out.println("Bus for Inserted succussfully!");
        } catch (DateTimeParseException e) {
            System.out.println("You Enter Time format Does not match!! please try again ");
        }
        catch(NumberFormatException e){
            System.out.println("You enter Fare is does not match!! Pleace correct this Fare");
        }
        
    }
    public void UpdateBus(){
        

    }

}
