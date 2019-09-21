
public class Hello {
	public static void main(String[] args) {
		String s = "g1d10c5";
		String chr = "";
		int count = 0;
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length;) {
			if (Character.isAlphabetic(ch[i])) {
				chr = ch[i] + "";
				i++;
			} else {
				
				while (i < ch.length && Character.isDigit(ch[i])) {
					count = 10 * count + Integer.parseInt(ch[i] + "");
					i++;
				}
				for (int j = 0; j < count; j++) {
					System.out.print(chr);
				}
				count = 0;
				chr = "";
			}
		}

	}
}
