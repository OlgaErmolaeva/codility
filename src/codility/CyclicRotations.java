package codility;

import java.util.Arrays;

public class CyclicRotations {

    public int[] solution(int[] A, int K) {

        K = K % A.length;

        int j = 0;
        int[] tempArray = new int[K];

        for (int i = A.length - K; i < A.length; i++) {

            tempArray[j] = A[i];
            j++;
        }
        System.out.println(Arrays.toString(tempArray));

        int[] array = new int[A.length];

        System.arraycopy(tempArray, 0, array, 0, K);
        System.arraycopy(A, 0, array, K, A.length - K);

        return array;
    }

}
