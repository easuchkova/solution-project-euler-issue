// The sum of the squares of the first ten natural numbers is,
// The square of the sum of the first ten natural numbers is,
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Problem6 implements Problem{
    @Override
    public void solution() {
        int sumOfSquares = 0;
        int sum = 0;
        int squareOfSums;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            sum += i;
        }
        squareOfSums = sum * sum;

        System.out.println();
        System.out.println("Problem 6");
        System.out.println(squareOfSums - sumOfSquares);
    }
}
