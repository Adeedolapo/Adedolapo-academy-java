import java.util.*;
public class MapDemo {

    public static void main(String[] args) {
    	HashMap<Integer, String> numbers = new HashMap<>();
    	numbers.put(1, "one");
    	numbers.put(2, "two");
    	numbers.put(3, "three");
    	numbers.put(4, "four");
    	numbers.put(5, "five");
    	numbers.put(6, "six");
    	numbers.put(7, "seven");
    	numbers.put(8, "eight");
    	numbers.put(9, "nine");
    	numbers.put(10, "ten");

    	for (Integer value : numbers.keySet()) {
            System.out.println(value + " : " + numbers.get(value));
            }

        	numbers.remove(7);

            numbers.put(11, "eleven");

            for (Integer newValue : numbers.keySet()) {
            System.out.println(newValue + " : " + numbers.get(newValue));
            }   	
        	
    }
}