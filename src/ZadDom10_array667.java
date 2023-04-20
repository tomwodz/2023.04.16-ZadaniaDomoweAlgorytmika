/*Warmup-2 > array667
        prev  |  next  |  chance

        Given an array of ints, return the number of times that two
        6's are next to each other in the array.
        Also count instances where the second "6" is actually a 7.

        array667([6, 6, 2]) → 1
        array667([6, 6, 2, 6]) → 1
        array667([6, 7, 2, 6]) → 1*/

import java.util.Arrays;
import java.util.Random;

public class ZadDom10_array667 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[20];
        for (
                int i = 0;
                i < nums.length; i++) {
            nums[i] = random.nextInt(8);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(array667(nums));
    }

    public static int array667(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)) {
                counter++;
            }
        }
        return counter;
    }
}
