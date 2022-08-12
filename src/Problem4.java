//        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//        Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {
    public void problem4() {
        int num;
        int localMax = 0;

        for (int i = 1; i < 999; i++) {
            for (int j = 1; j < 999; j++) {
                num = i * j;
                if (isPolindrome(num)) {
                    if (num > localMax) localMax = num;
                }
            }
        }

        System.out.println();
        System.out.println("Problem 4");
        System.out.println(localMax);

    }

    public boolean isPolindrome(int num) {
        String number = String.valueOf(num);

        int length = number.length();
        StringBuilder reverseNumber = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reverseNumber.append(number.charAt(i));
        }

        return reverseNumber.toString().equals(number);
    }
}
