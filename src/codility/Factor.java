package codility;

public class Factor {
    public int solution(int N) {
        int factorCounter = 0;
        int i = 1;
        while (i * i < N) {
            if (N % i == 0) {
                factorCounter += 2;

            }
            i++;
        }
        if (i*i == N) {
            factorCounter += 1;
        }
        return factorCounter;
    }
}
