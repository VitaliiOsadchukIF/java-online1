package module11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class sortedNames {

    // Створення об'єктів класу Names з іменами
    public static void main(String[] args) {
        Names andrij = new Names("Andrij");
        Names oksana = new Names("Oksana");
        Names sergij = new Names("Sergij");
        Names vitaliy = new Names("Vitaliy");
        Names taras = new Names("Taras");
        Names maria = new Names("Maria");

        // Створення списку з іменами
        List<Names> input = asList(andrij, oksana, sergij, vitaliy, taras, maria);

        List<String> resultSort = input.stream()
                .map(Names::getNames)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(resultSort);
    }
}