package codility;

import java.util.Deque;
import java.util.LinkedList;


public class FishNew {
    public int solution(int[] A, int[] B) {

        class Fish {
            private int size;
            private int direction;

            private Fish(int size, int direction) {
                this.size = size;
                this.direction = direction;
            }

            public int getDirection() {
                return direction;
            }


            public int getSize() {
                return size;
            }


        }

        Deque<Fish> river = new LinkedList<Fish>();

        for (int i = 0; i < A.length; i++) {

            Fish nextFish = new Fish(A[i], B[i]);

            if (nextFish.getDirection() == 1) {
                river.push(nextFish);
            }
            if (nextFish.getDirection() == 0) {

                while (!river.isEmpty() && river.peek().getDirection() == 1 && nextFish.getSize() > river.peek().getSize()) {
                    river.pop();
                }
                System.out.println("size after wile" + river.size());
                if (river.isEmpty() || river.peek().getDirection() == 0) {

                    river.push(nextFish);
                }


            }

            System.out.println("size end" + river.size());
        }


        return river.size();

    }
}