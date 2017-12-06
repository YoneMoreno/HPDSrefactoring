package case3;

public class Calculator {

    private long result;
    boolean squares;

    public Calculator() {
        result = getResult();
    }

    public long sum(int min, int max) {
        iterateToSumInRange(min, max, squares = false);
        return result;
    }

    public long sumOfSquares(int min, int max) {
        iterateToSumInRange(min, max, squares = true);
        return result;
    }

    private void iterateToSumInRange(int min, int max, boolean squares) {
        result = getResult();
        for (int i = min; i <= max; i++) {
            if (squares) result += i * i;
            if (!squares) result += i;
        }
    }

    private long getResult() {
        return (long) 0;
    }

}

