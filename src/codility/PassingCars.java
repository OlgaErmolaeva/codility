package codility;

public class PassingCars {
    public int solution(int[] A) {
        int length = A.length;
        int sumRight = 0;
        long prevResult = 0;
        int result = 0;

        for (int i = 0; i < length; i++) {
            sumRight += A[i];
        }

        for (int i = 0; i < length; i++) {

            sumRight -= A[i] == 1 ? 1 : 0;
            prevResult += A[i] == 0 ? sumRight : 0;
        }


        if (prevResult > 1000000000) {
            return -1;
        }
        result = (int) prevResult;
        return result;
    }
}
