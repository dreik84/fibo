package example.org;

public class Fibo {
    public static long[] fiboCache;

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

    public static long findFiboRecursive(int numOfElement) {

        if (numOfElement <= 1) return 0;
        if (numOfElement == 2) return 1;

        return findFiboRecursive(numOfElement - 1) + findFiboRecursive(numOfElement - 2);
    }

    public static long findFiboRecursiveWithCache(int numOfElement) {
        fiboCache = new long[numOfElement + 1];
        return calcFibo(numOfElement);
    }

    private static long calcFibo(int numOfElement) {

        if (numOfElement <= 1) return 0;
        if (numOfElement == 2) return 1;

        if (fiboCache[numOfElement] != 0) return fiboCache[numOfElement];

        long nthFiboNumber = calcFibo(numOfElement - 1) + calcFibo(numOfElement - 2);
        fiboCache[numOfElement] = nthFiboNumber;

        return nthFiboNumber;
    }

//    public static long findFiboStream(int numOfElement) {
//
//        return Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
//                .limit(numOfElement)
//                .map(y -> y[0])
//                .mapToInt(Integer::intValue)
//                .sum();
//    }
}
