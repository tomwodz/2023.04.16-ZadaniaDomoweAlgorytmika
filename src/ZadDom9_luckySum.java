import java.util.Arrays;
import java.util.Random;

/*Logic-2 > luckySum
        prev  |  next  |  chance

        Given 3 int values, a b c, return their sum.
        However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
        So for example, if b is 13, then both b and c do not count.

        luckySum(1, 2, 3) → 6
        luckySum(1, 2, 13) → 3
        luckySum(1, 13, 3) → 1*/
public class ZadDom9_luckySum {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[3];
        for (
                int i = 0;
                i < nums.length; i++) {
            nums[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(luckySum(nums[0], nums[1], nums[2]));
    }
    public static int luckySum(int a, int b, int c) {
        int luckySum =0;
        if(a != 13){
            luckySum =a;
            if (b != 13){
                luckySum = luckySum +b;
                if (c != 13){
                    luckySum = luckySum +c;
                }
            }
        }
        return luckySum;
    }

}
