package codility;

import java.util.Stack;

public class Dominator {
    public int solution(int[] A) {
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (numbers.isEmpty()) {
                numbers.push(A[i]);
            } else {
                if (numbers.peek() != A[i]) {
                    numbers.pop();
                } else {
                    numbers.push(A[i]);
                }
            }

        }
        if (numbers.isEmpty()) {
            return -1;
        } else {
            int candidate = numbers.peek();
            int count = 0;
            int indexDominator = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == candidate) {
                    count++;
                    indexDominator = i;
                }
            }
            if (count > A.length / 2) {
                return indexDominator;
            }
        }
        return -1;
    }

}
