import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class secondHighest {
    public static void main(String args[]) {
        Random rand = new Random();
        System.out.println("---------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int max = 0;
        int second_max = 0;
        for (int i = 0; i < 300; i++) {
            int new_number = rand.nextInt(9000) + 1000;
            numbers.add(new_number);
            int last_number = numbers.get(numbers.size() - 1);
            if (last_number > max) {
                int last_max = max;
                max = last_number;
                if (last_max > second_max) {
                    second_max = last_max;
                }
            } else if (last_number > second_max && last_number < max) {
                second_max = last_number;
            }
        }
        System.out.println(numbers.toString());
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers.toString());
        System.out.println("max = " + max);
        System.out.println("second_max = " + second_max);
    }
}
