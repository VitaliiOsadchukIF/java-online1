package module11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("1, 2, 0", "4, 5");

        // Отримуємо всі числа з масиву
        List<Integer> numbers = new ArrayList<>();
        arr.stream()
                .map(str -> str.split(", "))
                .forEachOrdered(numArr -> Arrays.stream(numArr)
                        .map(Integer::parseInt)
                        .forEachOrdered(numbers::add));


        System.out.printf(numbers.stream()
                .sorted()
                .map(i -> i.toString())
                .collect(Collectors.joining(", ")));

    }
}
