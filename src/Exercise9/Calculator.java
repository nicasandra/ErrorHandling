package Exercise9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class Calculator {
    public Integer add(Integer a, Integer b) throws OverflowException, UnderflowException {
        Integer sum = a + b;
        if ((a > 0) && (b > 0) && (sum < 0)) {
            throw new OverflowException("Overflow exception!");
        } else if ((a < 0) && (b < 0) && (sum > 0)) {
            throw new UnderflowException("Underflow exception!");
        }
        return sum;

    }

    public Integer divide(Integer a, Integer b) {
        if (b == 0) {
            throw new ArithmeticException("Illegal B!");
        }
        return a / b;
    }

    public Integer average(List<Integer> collection) {
        Integer sum = 0;
        for (int i = 0; i < collection.size(); i++) {
            try {
                sum = this.add(sum, collection.get(i));
            } catch (OverflowException e) {
                e.printStackTrace();
            } catch (UnderflowException e) {
                e.printStackTrace();
            }
        }

        return this.divide(sum, collection.size());
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        try {
            System.out.println(new Calculator().add(-2147483647, -4));
        } catch (OverflowException e) {
            System.out.println(e.message);
        } catch (UnderflowException e) {
            System.out.println(e.message);
        }
        List<Integer> ints = new ArrayList();
        ints.add(5);
        ints.add(5);
        ints.add(5);
        ints.add(5);
        System.out.println(new Calculator().average(ints));

    }
}
