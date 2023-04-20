import java.util.Arrays;

/*Array-3 > squareUp
        prev  |  next  |  chance

        Given n>=0, create an array length n*n with the following pattern,
        shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        squareUp(2) → [0, 1, 2, 1]
        squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]*/
public class ZadDom6_squareUp {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(squareUp(n)));
        System.out.println(Arrays.toString(squareUp(n + 1)));
        System.out.println(Arrays.toString(squareUp(n + 2)));

    }

    public static int[] squareUp(int n) {
        int[] squareUp = new int[n * n];
        int nV = 1;
        int ile = n;
        for (int i = squareUp.length - 1; i >= 0; i--) {
            if (nV <= n) {
                if (nV <= ile) {
                    squareUp[i] = nV;
                } else {
                    squareUp[i] = 0;
                }
                nV++;
                if (nV > n) {
                    nV = 1;
                    ile--;
                }
            }
        }
        return squareUp;
    }
}
