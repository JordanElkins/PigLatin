package cst105n.w2.e4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class translator {

	public static void main(String[] args) {

		File filePath = new File("convert.txt");
		Scanner sc;
		try {
			sc = new Scanner(filePath);
			while (sc.hasNext()) {
				/* Takes the convert.txt file and scans it to sc, then makes that scan String
				 * english. String pigLatin is made from method getPigLatin where the translations are happening.
				 * Use a format sys.out format style to display the results in tabular format
				 */
				String english = sc.next().trim();
				String pigLatin = getPigLatin(english).toUpperCase();
				System.out.println(String.format("%s\t\t%-15s", english, pigLatin));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getPigLatin(String word) {
		String result = "";
		for (int i = 0;; i++) {
			//Looks for vowel in the first position of a word
			char d = word.charAt(i);
			if (d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U' || d == 'a' || d == 'e' || d == 'i' || d == 'o'
					|| d == 'u') {
				//Takes the word and adds way
				result = word + "way";
				return result;

			}
			//Looks for vowel in the second position of a word
			char c = word.charAt(1);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
					|| c == 'u') {
				/*Takes the word removes the first letter(leaving the remainder)
				 * The next section then selects which letters we would like to "keep"
				 * and finally adds "ay" to the end
 				 */
				result = word.substring(1) + word.substring(0, 1) + "ay";
				return result;

			}
			//Looks for vowel in third position
			char m = word.charAt(2);
			if (m == 'A' | m == 'E' || m == 'I' || m == 'O' || m == 'U' || m == 'a' || m == 'e' || m == 'i' || m == 'o'
					|| m == 'u') {
				/*Same operation except we remove the first two letters and add
				 * them to the end + "ay"
				 */
				result = word.substring(2) + word.substring(0, 2) + "Ay";
				return result;
			}
			//Looks for vowel in fourth position
			char b = word.charAt(3);
			if (b == 'A' | b == 'E' || b == 'I' || b == 'O' || b == 'U' || b == 'a' || b == 'e' || b == 'i' || b == 'o'
					|| b == 'u') {
				/*Same operation except we remove the first three letters and add
				 * them to the end + "ay"
				 */
				result = word.substring(3) + word.substring(0, 3) + "ay";
				return result;
			}
		}

	}
}
