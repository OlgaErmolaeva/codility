package codility;

public class Permutation {
    public int solution(int[] A) {

        int[] newArray = new int[A.length + 1];
        int sumReal = 0;
        int Length = A.length;
        int sumMustBe = (1 + Length) * Length / 2;
        for (int i = 0; i < Length; i++) {
            int j = A[i];
            if (j <= Length && newArray[j] == 0) {
                newArray[j] = j;
                sumReal += newArray[j];
            } else {
                return 0;
            }

        }
        if (sumMustBe == sumReal) {
            return 1;
        } else {
            return 0;
        }
    }
}
