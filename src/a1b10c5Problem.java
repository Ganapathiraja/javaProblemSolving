
public class a1b10c5Problem {

	public static void main(String[] args) {

		String str = "a1v10c55e5";

		String isAplhabet = "";

		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {
				isAplhabet = str.charAt(i) + "";

				int isDigit = isDigit(str.substring(i + 1, str.length()));

				printMeSequence(isAplhabet, isDigit);

			}

		}

	}

	private static int isDigit(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
				String number = new StringBuilder("").append(str.charAt(i)).append(str.charAt(i + 1)).toString();
				return Integer.parseInt(number);
			} else {
				if (Character.isDigit(str.charAt(i))) {
					String s = str.charAt(i) + "";
					return Integer.parseInt(s);
				}
			}
		}

		return -1;
	}

	private static void printMeSequence(String isAplhabet, int isDigit) {
		// TODO Auto-generated method stub
		for (int i = 0; i < isDigit; i++) {
			System.out.print(isAplhabet);
		}
	}
}
