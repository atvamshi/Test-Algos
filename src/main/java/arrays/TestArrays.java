package arrays;

import java.util.Arrays;

/**
 * Project: algo-test
 * Package: arrays
 * <p>
 * User: vthalapu
 * Date: 3/22/18
 * Time: 8:58 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestArrays {
    static public void main(String... args) {
        Integer[] array = new Integer[]{1, 2, 3, 4};
        Integer[] arrayDup = new Integer[]{5, 6, 7, 8};

        System.arraycopy(array, 0, arrayDup, 0, array.length);

        System.out.println(Arrays.toString(arrayDup));


    }
}