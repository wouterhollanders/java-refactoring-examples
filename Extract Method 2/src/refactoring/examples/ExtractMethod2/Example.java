package refactoring.examples.ExtractMethod2;

class Accumulator {
    int sum = 0;
}

public class Example {
    // Original implementation (correct behavior)
    public int calculateSumOriginal(int[] numbers) {
        Accumulator accumulator = new Accumulator();
        for (int number : numbers) {
            accumulate(accumulator, number);
        }
        return accumulator.sum;
    }

    private void accumulate(Accumulator accumulator, int number) {
        accumulator.sum += transform(number);
    }

    // Incorrectly refactored method
    public int calculateSumRefactored(int[] numbers) {
        Accumulator accumulator = new Accumulator();
        computeSum(numbers, accumulator);  // Extracted method call
        return accumulator.sum;
    }

    private void computeSum(int[] numbers, Accumulator accumulator) {
        for (int number : numbers) {
            accumulate(accumulator, number);
        }
    }

    private int transform(int number) {
        number *= 2; // Simulates transformation but has no actual side effects
        return number;
    }
}

