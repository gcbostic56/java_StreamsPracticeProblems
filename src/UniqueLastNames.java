import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueLastNames {
    public static Scanner scanner = new Scanner(System.in);
    public static void unique() {
        ArrayList<String> people = new ArrayList<>();
        System.out.println("You will be entering some personal information.");

        while(true) {
        System.out.println("Please enter your first name.");
        String fName = scanner.nextLine();
        System.out.println("Please your last name.");
        String lName = scanner.nextLine();
        System.out.println("Please enter a birth year.");
        people.add(lName);
        String year = scanner.nextLine();
        System.out.println("Continue personal information input? 'quit' ends:");
        String beep = scanner.nextLine();
        if (beep.equalsIgnoreCase("quit")) {
            break;
        }
        System.out.println("We will continue entering information.");
        }
        ArrayList<String> lastNamePeople = people.stream()
        .sorted()
        .collect(Collectors.toCollection(ArrayList::new));
        lastNamePeople.forEach(System.out::println);
    }
}
