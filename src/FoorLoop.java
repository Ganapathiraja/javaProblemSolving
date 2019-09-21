
public class FoorLoop {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {
				System.out.println("inside");
				
				if(i==0) {
					System.out.println("if");
					break;
				}
			}
			System.out.println("hello");

		}

	}
}
