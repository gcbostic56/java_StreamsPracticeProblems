import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        // List<String> inputs = new ArrayList<>();
        // Average.toAverage();
        
        // List<Integer> cameron = new ArrayList<>();
        // cameron.add(10);
        // cameron.add(-20);
        // cameron.add(5);
        // positive(cameron);

        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(3);
        // numbers.add(2);
        // numbers.add(-17);
        // numbers.add(-5);
        // numbers.add(7);

        // ArrayList<Integer> divisible = (ArrayList<Integer>) divisible(numbers);

        // divisible.stream()
        //         .forEach(num -> System.out.println(num));
        // PrintingUserInput.printing();
        // LimitedUsers.printResults();
        // UniqueLastNames.unique();

        read("src/file.txt");
        
    }
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveNumbers = numbers.stream()
        .filter(value -> value > 0)
        .collect(Collectors.toCollection(ArrayList::new));
        positiveNumbers.forEach(System.out::println);
        return positiveNumbers;
    }
    public static List<Integer> divisible(List<Integer> mooc) {
        List<Integer> divisibleNumbers = mooc.stream()
        .filter(value -> value % 5 == 0 || value % 3 == 0 || value % 2 == 0)
        .collect(Collectors.toCollection(ArrayList::new));
        return divisibleNumbers;
    }
    public static List<String> read(String file) { 
    List<String> files = new ArrayList<>();
    try {
        Files.lines(Paths.get(file)).forEach(row -> files.add(row));
        files.forEach(System.out::println);
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    return files;
    }
    
}
