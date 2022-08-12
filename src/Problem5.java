//      2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//      What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {
    public void problem5() {
        int multiple = 1;
//        int[] primes = {5, 2, 2, 2, 2, 3, 3, 7, 19, 17, 13, 11}; // все простые числа являющиеся которых входят в множетели до 20

        for (int i = 3; i <= 20; i++) {
            if (multiple % i != 0)
                if (multiple * 2 % i == 0)
                    multiple = multiple * 2;
                else if (multiple * 3 % i == 0)
                    multiple = multiple * 3;
                else
                    multiple = multiple * i;
        }

        System.out.println();
        System.out.println("Problem 5");
        System.out.println(multiple);
//        System.out.println(5*2*2*2*2*3*3*7*19*17*13*11);

    }
}
