package codility;

public class Brackets {
    public int solution(String S) {

        if (S.length() == 0) {
            return 1;
        }

        int[] bracketArray = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {

            switch (S.charAt(i)) {

                case '(':
                    bracketArray[i] = 1;
                    break;
                case '[':
                    bracketArray[i] = 2;
                    break;
                case '{':
                    bracketArray[i] = 3;
                    break;
                case ')':
                    bracketArray[i] = -1;
                    break;
                case ']':
                    bracketArray[i] = -2;
                    break;
                case '}':
                    bracketArray[i] = -3;
                    break;
                default:
                    return 0;
            }
        }

        int[] checkArray = new int[S.length()];
        int index = 0;

        for (int i = 0; i < bracketArray.length; i++) {

            if (bracketArray[i] > 0) {
                checkArray[index] = bracketArray[i];
                index++;
            } else {
                index--;
                if (index < 0) {
                    return 0;
                }
                checkArray[index] += bracketArray[i];
                if (checkArray[index] != 0) {
                    return 0;
                }

            }

        }
        if (index == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}