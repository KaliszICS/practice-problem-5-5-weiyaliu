public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isPalindrome (String str) {

		if (str.length() == 0) { 
        return true;

		}

		str= str.replace(" ","").toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		
		return true;
	}

}
