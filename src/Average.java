import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Average {
    public static Scanner scanner = new Scanner(System.in);

    public static void toAverage() {
    System.out.println("Please enter another a number to add to list.");   
    List<String> inputs = new ArrayList<>();
    while (true) {
    String row = scanner.nextLine();
    
    if (row.equalsIgnoreCase("end")) {
        break;
    }
    if (isNumber(row)) {
    inputs.add(row);
    }
    System.out.println("Please enter another number or enter 'end'.");
    }
    System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
    String input2 = scanner.nextLine();
    if (input2.equalsIgnoreCase("n")) {
        double negativeAverage = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(negativeNumber -> negativeNumber < 0)
        .average()
        .getAsDouble();
        System.out.println("Average negative number is " + negativeAverage);

    }
    if (input2.equalsIgnoreCase("p")) {
        double positiveAverage = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(positiveNumber -> positiveNumber > 0)
        .average()
        .getAsDouble();
        System.out.println("Average positve number is " + positiveAverage);
    }
    double average = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .average()
    .getAsDouble();
    System.out.println("Average number is: " + average);

    }
    public static boolean isNumber(String amount) {
        try {
            Integer.parseInt(amount);
            return true;
        }
     catch(NumberFormatException e) {
        return false;
    }
    }
    
}
