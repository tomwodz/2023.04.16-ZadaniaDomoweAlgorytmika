/*
Array-2 > countEvens
        prev  |  next  |  chance

        Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) →
*/

import java.util.Arrays;
import java.util.Random;

public class ZadDom1_countEvens {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println("Liczba parzystych intów wynosi: "+ countEvens(nums));

    }
    public static int countEvens(int[] nums) {
        int x = 0;
        for (int i = 0 ; i < nums.length; i++){
            if(nums[i] % 2 == 0){x++;}
        }
        return x;
    }

}
