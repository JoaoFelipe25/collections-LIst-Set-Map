package lists;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = new LinkedList<Integer>();

        numbers.add(2);
        numbers.add(0);
        numbers.add(3);
        numbers.add(22);
        numbers.add(25);
        numbers.add(12);
        numbers.add(7);
        numbers.add(26);

        System.out.println(numbers.get(4));
        System.out.println(numbers.indexOf(0));
    }
}
