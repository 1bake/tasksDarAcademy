package bit.bakdaulet;

import java.util.Arrays;

public class EightTask {
    public static void main(String[] args) {
        int[] array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original numeric array : "+Arrays.toString(array));
        Arrays.sort(array);
        int in = array.length-1;
        while(array[in]==array[array.length-1]){
            in--;
        }
        System.out.println("Second largest value: " + array[in]);
    }
}
