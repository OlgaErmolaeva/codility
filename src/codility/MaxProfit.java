package codility;

public class MaxProfit {
    public int solution(int[] A) {
        if(A.length<2){
            return 0;
        }
        int buy =A[0];
        int sale =0;
        int profit =0;
        for (int i = 1; i < A.length; i++) {
            if (A[i]<buy){
                buy = A[i];
                sale=0;
            }else if (A[i] > sale) {
                sale = A[i];
                profit = Math.max(profit, sale - buy);
            }

        }
        return profit;
    }
}
