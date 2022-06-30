package lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>(3);

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(22);
        numbers.add(25);
        numbers.add(12);
        numbers.add(8);
        numbers.add(26);


        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("ordenando de forma crescente: " + numbers);

        Collections.reverse(numbers );
        System.out.println("ordenando de forma decrescente" + numbers);

        //obtem pelo index
        System.out.println(numbers.get(3));

        //remove pelo index
        System.out.println(numbers.remove(2));

        System.out.println(numbers);
    }
}
