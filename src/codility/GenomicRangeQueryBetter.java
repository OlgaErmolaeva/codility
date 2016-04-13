package codility;

public class GenomicRangeQueryBetter {
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] charStore = new int[S.length() + 1][3];


        for (int i = 0; i < S.length(); i++) {
            int a = 0;
            int c = 0;
            int g = 0;
            char letterDNA = S.charAt(i);

            switch (letterDNA) {
                case 'A':
                    a = 1;
                    break;
                case 'C':
                    c = 1;
                    break;
                case 'G':
                    g = 1;
                    break;
            }

            charStore[i + 1][0] = charStore[i][0] + a;
            charStore[i + 1][1] = charStore[i][1] + c;
            charStore[i + 1][2] = charStore[i][2] + g;


            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < charStore.length; j++) {
                    System.out.print(charStore[j][k]);
                }
            }
        }

        int[] result = new int[P.length];
        int indexStart = 0;
        int indexEnd = 0;
        for (int i = 0; i < P.length; i++) {
            indexStart = P[i];
            System.out.print(indexStart);
            indexEnd = Q[i] + 1;
            System.out.println(indexEnd);
            if (charStore[indexEnd][0] - charStore[indexStart][0] > 0) {
                result[i] = 1;
            }else
            if (charStore[indexEnd][1] - charStore[indexStart][1] > 0) {
                result[i] = 2;
            }else
            if (charStore[indexEnd][2] - charStore[indexStart][2] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }


        }
        return result;
    }
}