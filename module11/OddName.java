package module11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class OddName {

    public static void main(String[] args) {


        // Створення списку з іменами
        List<String> input = asList("John", "Bill", "Vlad", "Oleksandr", "Anna", "Petro", "Oleg");

        String result = IntStream.range(0, input.size()) // Використання IntStream для створення послідовності чисел від 0 до розміру списку
                .filter(i -> i % 2 != 0) // Фільтрація елементів за допомогою лямбда-виразу
                .mapToObj(i -> (i) + ". " + input.get(i))
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
