package wooj.study.steam.Integer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomStream {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RandomStreamMethods().randomInteger().stream().filter(integer -> integer < 5) // 필터
                .sorted() // 정렬
                .distinct() // 중복제거
                .toArray())); // Array 형변환

        System.out.println(Arrays.toString(new RandomStreamMethodsParallel().randomIntegerParallel().stream().filter(integer -> integer < 5) // 필터
                .sorted() // 정렬
                .distinct() // 중복제거
                .toArray())); // Array 형변환
    }
}

class RandomStreamMethods { // 1부터 45까지 랜덤으로 만들어지는 메소드 , return => List


    List<Integer> randomInteger() {
        long beforeTime = System.currentTimeMillis();
        List<Integer> tmpArr = new ArrayList<>();

        int num = 1;
        while (num <= 7) {
            IntStream intStream = new Random().ints(1, 46);
            List<Integer> randArr = Arrays.stream(intStream.distinct().limit(10).toArray()).boxed().collect(Collectors.toList());
            tmpArr.addAll(randArr);

            num++;
        }

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = afterTime - beforeTime; //두 시간에 차 계산
        System.out.println("randomInteger 시간차이 : "+ secDiffTime);

        return tmpArr;
    }



}

class RandomStreamMethodsParallel {

    List<Integer> randomIntegerParallel() {

            long beforeTime = System.currentTimeMillis();
            List<Integer> tmpArr = new ArrayList<>();

            int num = 1;
            while (num <= 7) {
                IntStream intStream = new Random().ints(1, 46).parallel();
                List<Integer> randArr = Arrays.stream(intStream.distinct().limit(10).toArray()).boxed().collect(Collectors.toList());
                tmpArr.addAll(randArr);

                num++;
            }

            long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
            long secDiffTime = afterTime - beforeTime; //두 시간에 차 계산
            System.out.println("randomIntegerParallel 시간차이 : "+ secDiffTime);

            return tmpArr;

    }

}

