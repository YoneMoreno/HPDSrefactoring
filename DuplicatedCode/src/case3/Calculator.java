package case3;

public class Calculator {

    private long result;

    public Calculator() {
        result = getResult();
    }

    public long sum(int min, int max) {
        iterateToSumInRange(min, max);
        return result;
    }

    public long sumOfSquares(int min, int max) {
        long result = getResult();
        for (int i = min ; i <= max ; i++)
            result += i * i;
        return result;
    }

    private void iterateToSumInRange(int min, int max) {
        for (int i = min ; i <= max ; i++)
            result += i;
    }

    private long getResult() {
        return (long) 0;
    }

}

