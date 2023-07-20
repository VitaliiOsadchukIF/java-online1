package module11;


import java.util.stream.Stream;

public class Random {

       public static Stream<Long> randomGenerator(Long seed, Long a, Long c, Long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);

    }

    public static void main(String[] args) {
        Stream<Long> randomStream = randomGenerator(1232L, 25214903917L, 11L, (long) Math.pow(2, 48));
            randomStream.limit(10).forEach(System.out::println);

    }


    
}
