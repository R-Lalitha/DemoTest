package practicejava;

public class ForLoopPyramid2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				
				// System.out.println("\t");
			}
			System.out.println(" ");
		}

	}

}