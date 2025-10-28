package example.org;

import java.math.BigInteger;

public class FiboApp {
    public static void main(String[] args) {
        int numOfElement = 100;

        long start = System.currentTimeMillis();

        BigInteger fibo = Fibo.findFibo(numOfElement);

        long end = System.currentTimeMillis();

        System.out.printf("Calculate the %dth element of the Fibonacci sequence: %d in %d milliseconds\n",
                numOfElement, fibo, end - start);

        start = System.currentTimeMillis();

        fibo = Fibo.findFiboRecursive(numOfElement);

        end = System.currentTimeMillis();

        System.out.printf("Calculate the %dth element of the Fibonacci sequence: %d in %d milliseconds\n",
                numOfElement, fibo, end - start);

        start = System.currentTimeMillis();

        long fiboLong = Fibo.findFiboRecursiveWithCache(numOfElement);

        end = System.currentTimeMillis();

        System.out.printf("Calculate the %dth element of the Fibonacci sequence: %d in %d milliseconds\n",
                numOfElement, fiboLong, end - start);
    }
}
