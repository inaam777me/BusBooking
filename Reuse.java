import java.util.ArrayList;
import java.util.Scanner;

public class Reuse {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> scannerGet(String[] InsertString){
        ArrayList<String> InsertedData = new ArrayList<>();
        for (String i : InsertString) {
            System.out.println(i);
            InsertedData.add(scanner.nextLine());              
        }
        return InsertedData;

    }
    
}
