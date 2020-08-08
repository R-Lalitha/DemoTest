package practicejava;

public class RecverseClassPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = "lalitha";
		String ver = "";

		for (int i = rev.length() - 1; i >= 0; i--)

		{
			ver = ver + rev.charAt(i);
		}

		if (ver == rev) {
			System.out.println(" palindrome");

		} else {
			System.out.println("Not palindrome");
		}
	}

}
