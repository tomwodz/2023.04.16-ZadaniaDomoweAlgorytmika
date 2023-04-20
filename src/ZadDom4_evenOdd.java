/*Array-2 > evenOdd
        prev  |  next  |  chance

        Return an array that contains the exact same numbers as the given array,
        but rearranged so that all the even numbers come before all the odd numbers.
        Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.*/

import java.util.Arrays;
import java.util.Random;

public class ZadDom4_evenOdd {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[8];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(evenOdd(nums)));

    }

    public static int[] evenOdd(int[] nums) {
        int[] tab = new int[nums.length];
        boolean[] tab2 = new boolean[nums.length];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0 || nums[i] == 0) {
                for (int j = 0; j < nums.length; j++){
                    if(tab[j] == 0 && tab2[j] != true){
                        tab[j] = nums[i];
                        tab2[j] = true;
                    break;}
                }
            }
            }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0 && nums[i] != 0){
                for (int j = 0; j < nums.length; j++){
                    if(tab[j] == 0 && tab2[j] != true)
                    {tab[j] = nums[i];
                        break;}
                }
            }
        }
    return tab;
    }

}
