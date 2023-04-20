/*Array-2 > lucky13
        prev  |  next  |  chance

        Given an array of ints, return true if the array contains no 1's and no 3's.

        lucky13([0, 2, 4]) → true
        lucky13([1, 2, 3]) → false
        lucky13([1, 2, 4]) → false*/

import java.util.Arrays;
import java.util.Random;

public class ZadDom3_lucky13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println("Tablica nie zawiera 1 i 3: " + lucky13(nums));

    }
    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
