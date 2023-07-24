package module11;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class OddName {

    public static void main(String[] args) {


        // Створення списку з іменами
        List<String> input = asList("John", "Bill", "Vlad", "Oleksandr", "Anna", "Petro", "Oleg");

        IntStream.range(0, input.size()) // Використання IntStream для створення послідовності чисел від 0 до розміру списку
                .filter(i -> i % 2 != 0) // Фільтрація елементів за допомогою лямбда-виразу
                .forEach(i -> System.out.println(input.get(i))); // Виконання дії для кожного елемента за допомогою лямбда-виразу
    }
}
