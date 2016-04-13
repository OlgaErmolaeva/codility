package codility;

public class MissingElement {
    public int solution(int[] A, int N) {

        long sumMustBe = (1 + 1 + A.length) * (A.length + 1) / 2;

        long sumReal = 0;
        for (int i = 0; i < A.length; i++) {
            sumReal += A[i];
        }
        int sumMustBeCast = (int) sumMustBe;
        int sumRealCast = (int) sumReal;
        int result = sumMustBeCast - sumRealCast;
        return result;


    }
}
