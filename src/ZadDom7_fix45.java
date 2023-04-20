/*Array-3 > fix45
        prev  |  next  |  chance

        (This is a slightly harder version of the fix34 problem.)
         Return an array that contains exactly the same numbers as the given array,
         but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move.
         The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
         In this version, 5's may appear anywhere in the original array.

        fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
        fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
        fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]*/

import java.util.Arrays;
import java.util.Random;

public class ZadDom7_fix45 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(7);
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(fix45(nums)));
    }

    public static int[] fix45(int[] nums) {
        int[] tab = new int[nums.length];
        boolean[] tab45A = new boolean[nums.length];
        boolean[] tab45B = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                tab[i] = nums[i];
                tab45A[i] = true;
                tab45B[i] = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && tab45A[i] == false) {
                for (int j = 1; j < nums.length; j++) {
                    if (tab45B[j - 1] == true && tab45B[j] == false && tab[j - 1] != nums[i]) {
                        tab[j] = nums[i];
                        tab45B[j] = true;
                        tab45A[i] = true;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (tab45A[i] == false) {
                for (int j = 0; j < nums.length; j++) {
                    if (tab45B[j] == false) {
                        tab[j] = nums[i];
                        tab45B[j] = true;
                        tab45A[i] = true;
                        break;
                    }
                }
            }
        }
        return tab;
    }
}
