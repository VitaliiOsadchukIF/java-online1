package module11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SortedNames {


    // Створення об'єктів класу Names з іменами
    public static void main(String[] args) {


        // Створення списку з іменами
        List<String> input = asList("John", "Bill", "Vlad", "Oleksandr", "Anna", "Petro", "Oleg");

        List<String> resultSort = input.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(resultSort);
    }
}