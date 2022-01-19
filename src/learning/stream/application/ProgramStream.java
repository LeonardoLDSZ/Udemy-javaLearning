package stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Bob", "Deva");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Double> st3 = Stream.of(200.00 + 300,1000.00 / 20.0, 400.0 - 250.00);
        System.out.println(Arrays.toString(st3.toArray()));

        Stream<Integer> st4 = Stream.iterate(10,x -> x + 4);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));

        Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st5.limit(1000).toArray()));

    }
}
