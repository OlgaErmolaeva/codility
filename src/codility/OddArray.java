package codility;

public class OddArray {
    public int solution(int[] A) {


        int value = 0;
        boolean flag = false;
        for (int i = 0; i < A.length - 1; i++) {

            if (A[i] >= 0) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j]) {
                        A[i] = -1;
                        A[j] = -1;
                        flag = true;
                        break;
                    }else {
                        flag = false;
                    }
                }
                if (flag == false){
                    value = A[i];
                }
            }
        }
        if (A[A.length-1]!= -1){
            value = A[A.length-1];
        }
        return value;
    }
}
