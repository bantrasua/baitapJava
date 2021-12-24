import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String array[] = function.inputArray();

        function.printArray(array);

        System.out.println("\n\"Java\" suat hien " + function.countElement(array) + " lan trong mang!");
        
        function.find(array);
    }
}
