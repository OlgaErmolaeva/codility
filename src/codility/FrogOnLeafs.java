package codility;

public class FrogOnLeafs {
    public int solution(int X, int[] A) {
        int Lenth = A.length;
        int[] newArray = new int[Lenth+1];
        int sumInNewArray = 0;
        int sumNecessary = (1 + X) * X / 2;

        int i = 0;
        for ( i = 0; i < Lenth; i++) {
            int j = A[i];

            if (j<=Lenth  && newArray[j] == 0 ) {
                newArray[j] = j;
                sumInNewArray += newArray[j];
                if (sumInNewArray == sumNecessary) {
                    break;
                }
            }
        }
        if (i == Lenth) {
            return -1;

        }

        return i;
    }
}
