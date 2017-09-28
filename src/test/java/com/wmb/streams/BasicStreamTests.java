package com.wmb.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * For the record these are not unit test. I am using junit as a convenient way to
 * explore streams
 * examples pulled from https://www.tutorialspoint.com/java8/java8_streams.htm
 */
public class BasicStreamTests {
    @Test
    public void basicFilterTest() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(
                string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("original: "+strings);
        System.out.println("filtered: "+filtered);
    }

    @Test
    public void basicForEachTest(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        random.ints().limit(10).sorted().forEach(System.out::println);

    }
    @Test
    public void basicForEachTest2(){
        Random random = new Random();
        random.ints().limit(10).forEach(this::doStuff);
    }
    private void doStuff(int target){
        System.out.println(target);
    }

    @Test
    public void basicMapTest(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println(numbers);
        List<Integer> squaresList = numbers.stream().map(
                i -> i*i)
                .distinct().collect(Collectors.toList());
        System.out.println(squaresList);
    }

    @Test
    public void basicParellelStreamTest(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }
    @Test
    public void basicCollectorsTests(){
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }
    @Test
    public void basicStatisticsTest(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}

