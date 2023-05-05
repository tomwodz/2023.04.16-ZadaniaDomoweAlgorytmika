import java.util.Arrays;
import java.util.Random;

/*Array-2 > sum13
        prev  |  next  |  chance

        Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6*/
public class ZadDom2_sum13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(20);
        }
        int[] nums2 = {15,1,15,1,1};
        System.out.println(Arrays.toString(nums));
        System.out.println("Suma wynosi: "+ sum13(nums));

        System.out.println(Arrays.toString(nums2));
        System.out.println("Suma wynosi: "+ sum13(nums2));
    }
    public static int sum13(int[] nums) {
        int x = 0;
        if(nums.length == 0){return x;}
        if(nums[0] != 13){x = nums[0];}
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 13 && nums[i-1] != 13)
                x = x + nums[i];
        }
        return x;
    }
}
