import java.util.Arrays;

public class Sum{
    public static void main(String[] args) {
        
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        Arrays.sort(values);
        int secondLargest = values[values.length - 2];
        int thirdLargest = values[values.length - 3];
        System.out.println("Sum is " + (values[values.length - 2] + values[values.length - 3]));

    }
}
