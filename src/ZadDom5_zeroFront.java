import java.util.Arrays;
import java.util.Random;

/*
Array-2 > zeroFront
        prev  |  next  |  chance

        Return an array that contains the exact same numbers as the given array,
        but rearranged so that all the zeros are grouped at the start of the array.
        The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
        You may modify and return the given array or make a new array.

        zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
        zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
        zeroFront([1, 0]) → [0, 1]*/
public class ZadDom5_zeroFront {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[8];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(zeroFront(nums)));
    }

    public static int[] zeroFront(int[] nums) {
        int cou = 0;
        int[] x = {};
        if(nums.length == 0){return x;}
        int[] tabResult = new int[nums.length];
        for (int i = 0; i <nums.length; i++)
        {
            if(nums[i] == 0){cou++;}
        }
        for (int i = 0; i <cou || i ==0; i++){
    tabResult[i] = 0;
        }
        boolean run = true;
        while(run) {
            for (int i = cou; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        tabResult[i] = nums[j];
                        nums[j] = 0;
                        cou++;
                        if(cou == nums.length){run = false;}
                        break;
                    }
                }
            }
        }
    return tabResult;
    }
    }


