import java.util.Arrays;
import java.util.Random;

/*Logic-2 > closeFar
        prev  |  next  |  chance

        Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
        while the other is "far", differing from both other values by 2 or more.
         Note: Math.abs(num) computes the absolute value of a number.
        closeFar(1, 2, 10) → true
        closeFar(1, 2, 3) → false
        closeFar(4, 1, 3) → true*/
public class ZadDom8_closeFar {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[3];
        for (
                int i = 0;
                i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println((closeFar(nums[0], nums[1], nums[2])));
    }
    public static boolean closeFar(int a, int b, int c) {
        boolean closeFar = false;
        int x = Math.abs(b - a);
        int y = Math.abs(c - a);
        int z = Math.abs(c - b);
        if ((x < 2 && (y >= 2 && z >= 2)) || (y < 2 && (x >= 2 && z >= 2))) {
            closeFar = true;
        }
        return closeFar;
    }
}
