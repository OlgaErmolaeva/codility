package codility;

public class BinaryGap {
    public void solution(int i) {

        String number = Integer.toBinaryString(i);

        int count = 0;
        int gap = 0;
        int digit;
        int amount = 0;
        for (int j = 0; j < number.length(); j++) {
            amount++;
            digit = number.charAt(j);

            if (digit == '0') {
                count++;
                gap = Math.max(gap, count);

            } else {
                count = 0;
            }

        }

    }

}
