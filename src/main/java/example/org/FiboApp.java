package example.org;

public class FiboApp {
    public static void main(String[] args) {
        int numOfElement = 50;

        long start = System.currentTimeMillis();

        long fibo = Fibo.findFibo(numOfElement);

        long end = System.currentTimeMillis();

        System.out.printf("Calculate the %dth element of the Fibonacci sequence: %d in %d milliseconds\n",
                numOfElement, fibo, end - start);

        start = System.currentTimeMillis();

        fibo = Fibo.findFiboRecursive(numOfElement);

        end = System.currentTimeMillis();

        System.out.printf("Calculate the %dth element of the Fibonacci sequence: %d in %d milliseconds\n",
                numOfElement, fibo, end - start);

        start = System.currentTimeMillis();

        fibo = Fibo.findFiboRecursiveWithCache(numOfElement);

        end = System.currentTimeMillis();

        System.out.printf("Calculate the %dth element of the Fibonacci sequence: %d in %d milliseconds\n",
                numOfElement, fibo, end - start);
    }
}
