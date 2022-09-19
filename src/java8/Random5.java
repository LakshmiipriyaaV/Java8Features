package java8;
   
import java.util.Random;

class Random5 {
    public static void main(String[] args) {
 
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
        
 
    }
} 

