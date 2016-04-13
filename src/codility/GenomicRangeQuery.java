package codility;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int indexStart = 0;
        int indexEnd = 0;

        for (int i = 0; i < P.length; i++) {
            indexStart = P[i];
            indexEnd = Q[i];
            int min = Integer.MAX_VALUE;

            for (int j = indexStart; j <= indexEnd; j++) {
                int impact = 0;
                char letterDNA = S.charAt(j);
                System.out.println(j + "=" + S.charAt(j));
                switch (letterDNA) {
                    case 'A':
                        impact = 1;
                        break;
                    case 'C':
                        impact = 2;
                        break;
                    case 'G':
                        impact = 3;
                        break;
                    case 'T':
                        impact = 4;
                        break;

                }
                min = Math.min(min, impact);
                result[i] = min;

            }
        }
        return result;
    }
}
