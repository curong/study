package wooj.study.steam.Integer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


interface Test {
    void start();
}

public class ListStreamChange {
    public static void main(String[] args) {

        Test test = new StreamClosingTest();
        test.start();

        Test test2 = new StringArrToStream();
        test2.start();

        Test test3 = new IntegerArrToStream();
        test3.start();

    }
}

class StreamClosingTest implements Test {
    @Override
    public void start() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // list를 Stream으로 변환
        intStream.forEach(System.out::print); // forEach() 최종연산

        // Stream은 1회용, Stream에 대해 최종연산을 수행하면 Stream이 닫힌다.
        intStream = list.stream(); // List로 부터 Stream을 생성.
        intStream.forEach(System.out::print);
        System.out.println();
    }
}

class StringArrToStream implements Test {
    @Override
    public void start() {

        String[] strArr = new String[]{"a", "b", "c", "d", "e"};

        Stream<String> strStream = Stream.of("a", "b", "c", "d", "e");
        Stream<String> strStream2 = Stream.of(strArr);
        Stream<String> strStream3 = Stream.of(new String[]{"a", "b", "c", "d", "e"});
        Stream<String> strStream4 = Arrays.stream(strArr);


        strStream.forEach(System.out::print);
        System.out.println();
        strStream2.forEach(System.out::print);
        System.out.println();
        strStream3.forEach(System.out::print);
        System.out.println();
        strStream4.forEach(System.out::print);
        System.out.println();

    }

}

class IntegerArrToStream implements Test {
    @Override
    public void start() {

        Integer[] intArr = {1, 2, 3, 4, 5};

        Stream<Integer> integerStream = Arrays.stream(intArr);
        integerStream.forEach(System.out::print); System.out.println();

        integerStream = Arrays.stream(intArr);
        System.out.println(integerStream.reduce(Integer::max).get());

    }

}

