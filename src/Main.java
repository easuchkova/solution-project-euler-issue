public class Main {
    public static void main(String[] args) {

//       If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//       The sum of these multiples is 23.
//       Find the sum of all the multiples of 3 or 5 below 1000.

        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Problem 1");
        System.out.println(sum);


//      Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//      By starting with 1 and 2, the first 10 terms will be:
//      1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//      By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//      find the sum of the even-valued terms.

        sum = 0;
        int i = 0;

        while (Fibonacci.fibonacci(i) < 4000000) {
            if (Fibonacci.fibonacci(i) % 2 == 0) {
                sum += Fibonacci.fibonacci(i);
            }
            i++;
        }

        System.out.println("Problem 2");
        System.out.println(sum);


//      The prime factors of 13195 are 5, 7, 13 and 29.
//      What is the largest prime factor of the number 600851475143 ?

        long n = 600_851_475_143L;
        long j;
        for (j = 3; j <= n; j++) {
            if (n % j == 0){
                while (n % j == 0) {
                    n = n / j;
                }
            }
        }

        System.out.println("Problem 3");
        System.out.println(j);
    }
}

