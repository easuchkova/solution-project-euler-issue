//        The prime factors of 13195 are 5, 7, 13 and 29.
//        What is the largest prime factor of the number 600851475143 ?

public class Problem3 {
    public void problem3(){

        long n = 600_851_475_143L;
        long j;
        for (j = 3; j <= n; j++) {
            if (n % j == 0){
                while (n % j == 0) {
                    n = n / j;
                }
            }
        }
        System.out.println();
        System.out.println("Problem 3");
        System.out.println(j);
    }
}
