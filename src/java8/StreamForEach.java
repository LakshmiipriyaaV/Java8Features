package java8;

import java.util.Arrays;

public class StreamForEach {
	public static void main(String[] args) {
        String[] name = {"lachuu","lakshmipriya","Lakshmi","Priya"};
        Arrays.stream(name).forEach(System.out::println);
    }
}
