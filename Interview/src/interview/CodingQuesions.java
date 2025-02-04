package interview;

import java.util.Arrays;

public class CodingQuesions {

	public static Object[] productofallExcludingselfindex(int[] nums) {

		int product = Arrays.stream(nums).boxed().reduce(1, (a, b) -> a * b);

		return Arrays.stream(nums).boxed().map(e -> product / e).toArray();
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(productofallExcludingselfindex(array)));
	}

}
