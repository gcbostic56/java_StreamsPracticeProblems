import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedUsers {
    public static Scanner scanner = new Scanner(System.in);
    public static void printResults() {
        System.out.println("Enter positive numbers or enter a negative number to end program.");
        ArrayList<Integer> myList = new ArrayList<>();
        while(true) {
            Integer input = scanner.nextInt();
            if(input < 0) {
                break;
            }
            myList.add(input);
            System.out.println("Enter another positive number or negative number for exit.");
        }
        ArrayList<Integer> newList = myList.stream()
        .filter(value -> value <= 5 && value >= 1)
        .collect(Collectors.toCollection(ArrayList::new));
        newList.forEach(System.out::println);
        
    }
    public static int stringToInt(String word) {
        int newNumber = Integer.parseInt(word);
        return newNumber;
    }
}
