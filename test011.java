package algorithm;

public class test011 {

	public static void testBreakLabel() {
		int num = 0;
		for (int k = 0; k < 10; k++) {
			outermost: for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (i == 5 && j == 5) {
						break outermost;
					}
					num++;
				}
			}
		}

		System.out.println(num);
	}

	public static void testContinueLabel() {
		int num = 0;
		outermost: for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (i == 5 && j == 5) {
					continue outermost;
				}
				num++;
			}
		}

		System.out.println(num);

	}

	public static void testBreak() {
		int num = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (i == 5 && j == 5) {
					continue;
				}
				num++;
			}
		}

		System.out.println(num);

	}

	public static void main(String[] args) {
		testBreakLabel();
		testContinueLabel();
		testBreak();
	}
}
