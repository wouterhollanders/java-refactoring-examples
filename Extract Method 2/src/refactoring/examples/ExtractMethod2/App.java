package refactoring.examples.ExtractMethod2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var example = new Example();
		int[] numbers = {1, 2, 3, 4, 5};
		
        int result = example.calculateSumOriginal(numbers);
        int result2 = example.calculateSumRefactored(numbers);
        
        System.out.print(result);
        System.out.print(result2);

	}

}
