import java.util.ArrayList;
import java.util.Collections;

public class SortODDPositionInDESC {
	public static void main(String[] args) {

		int[] inputArray = { 13,2 ,4,15,12,10,5 };
		int length = inputArray.length;

		ArrayList<Integer> oddNumber = new ArrayList<Integer>(0);
		ArrayList<Integer> evenNumber = new ArrayList<Integer>(0);
		for (int i = 0; i < length; i++) {
			Integer val = inputArray[i];
			if (isEven(val)) {
				evenNumber.add(val);
			} else {
				oddNumber.add(val);
			}
		}
		Collections.sort(evenNumber);
		System.out.print("even: "+evenNumber);
		Collections.sort(oddNumber, Collections.reverseOrder());
		System.out.print("oddNumber: "+oddNumber);
		
		evenNumber.addAll(oddNumber);

		System.out.print(evenNumber);
	}

	public static boolean isEven(Integer x) {
		return x % 2 == 0;
	}

}
