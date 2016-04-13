package codility;

public class Frog {
    public int solution(int X, int Y, int D){
        int number = 0;
        if ((Y-X)% D != 0){
           number = (Y-X)/ D + 1;
        }else {
            number = (Y-X)/ D;

        }
        return number;
    }

}
