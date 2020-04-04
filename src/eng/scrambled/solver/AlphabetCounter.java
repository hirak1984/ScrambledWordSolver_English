package eng.scrambled.solver;

public class AlphabetCounter {

	// position 0 = A, 25 = Z ; case insensitive
	public static int[] count(String word) {
		int[] arr = new int[26];
		if (word != null && word.length() > 0) {
			char[] charArr = word.toLowerCase().toCharArray();
			for (char ch : charArr) {
				// 97 = a , 122 = z
				int num = (int) ch;
				if (num < 97 || num > 122) {
					throw new IllegalArgumentException("On alphabetic words accepted");
				}
				int index = num - 97;
				arr[index] = arr[index] + 1;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		String word = "mimmouthedness";
		int arr[] = count(word);
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			char ch = (char) (i + 97);
			int count = arr[i];
			System.out.println("Char = " + ch + ", count = " + count);
		}
	}
}
