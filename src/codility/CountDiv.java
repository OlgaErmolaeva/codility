package codility;


public class CountDiv {
    public int solution (int A, int B, int K){


        int result = A%K ==0? B/K - A/K+1:B/K - A/K;
        return result;
    }
}
