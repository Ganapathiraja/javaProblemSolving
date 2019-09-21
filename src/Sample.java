public class Sample {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (i == j) {
					System.out.print(j);
				} else if (j < 5) {
						System.out.print(" ");
				}

				if (i != 0) {

					if (i + j % 2 == 0) {
						System.out.print("*");
					}
				}

				if (i != j) {
					if (i + j == 4) {
						System.out.print(j);

						// System.out.println("i: "+i+" j: "+j);
					}else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}

	}
}
