import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintingUserInput {
   public static Scanner scanner = new Scanner(System.in);
   public static void printing() {
       System.out.println("Please enter a word or press enter to end the program.");
       List<String> Words = new ArrayList<>();
       while(true) {
       String input = scanner.nextLine();
       if (input.equalsIgnoreCase("")) {
           break;
       }
       Words.add(input);
       System.out.println("Enter another word or press enter to end program.");
       }
       Words.stream()
       .collect(Collectors.toCollection(ArrayList::new));
        Words.forEach(System.out::println);
   }
}
