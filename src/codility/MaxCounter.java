package codility;

public class MaxCounter {
    public int[] solution(int N, int[] A) {
        int lenght = A.length;
        int[] newArray = new int[N];
        int tempMax = 0;
        int absMax = 0;
        int j;

        for (int i = 0; i < lenght; i++) {

            if (A[i] <= N) {
                j = A[i] - 1;
                if (newArray[j] <= absMax) {
                    newArray[j] = absMax + 1;
                } else {
                    newArray[j] += 1;
                }
                tempMax = Math.max(tempMax, newArray[j]);

            } else {
                absMax = tempMax;
            }
        }

        for (int k=0;k<N;k++ ){
            if(newArray[k]<absMax){
                newArray[k]=absMax;
            }
        }

        return newArray;
    }
}
