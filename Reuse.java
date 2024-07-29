import java.util.ArrayList;
import java.util.Scanner;

public class Reuse {
    private static final Scanner scanner = new Scanner(System.in);
    
    public Scanner ScannerSet(){
        return scanner;
    }

    public ArrayList<String> scannerGet(String[] InsertString){
        ArrayList<String> InsertedData = new ArrayList<>();
        for (String i : InsertString) {
            System.out.println(i);
            InsertedData.add(scanner.nextLine());              
        }
        return InsertedData;
    }

    
}
