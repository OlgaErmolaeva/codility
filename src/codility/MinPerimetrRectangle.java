package codility;

public class MinPerimetrRectangle {
    public int solution(int N){
        int i = (int) Math.sqrt(N);
        for ( ;  i >0 ; i--) {
            if(N%i==0){
                return 2*(i+N/i);
            }

        }
        return 0;
    }
}
