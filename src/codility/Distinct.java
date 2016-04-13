package codility;

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        if (A.length < 1) {
            return 0;
        }
        Arrays.sort(A);
        int result = 1;
        for (int i = 1; i < A.length; i++) {

            result += A[i - 1] != A[i] ? 1 : 0;
        }

        return result;


    }
}
