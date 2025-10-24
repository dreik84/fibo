package example.org;

public class Fibo {

    public static long findFibo(int numOfElement) {
        long num1 = 0;
        long num2 = 1;

        if (numOfElement == 1) return num1;
        if (numOfElement == 2) return num2;

        for (int i = 2; i < numOfElement; i++) {
            long sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        return num2;
    }
}
