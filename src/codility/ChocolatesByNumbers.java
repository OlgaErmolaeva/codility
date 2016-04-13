package codility;


public class ChocolatesByNumbers {
    public int solution(int N, int M) {
        if(N<1|M<1){
            return 0;
        }
        if(N==1){
            return N;
        }
        int X=1;
        int counter = 0;
        while (X != 0) {
            X = (X + M) % N;
            counter+=1;

        }
        return counter;
    }


}
