package eng.scrambled.solver;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class Finder {

	public static List<String> findAllWordsContainingCharacters(File wordList, String scrambledCharacters,boolean returnFirst) throws IOException {
		List<String> retVal = new LinkedList<>();
		int[] arr1 =AlphabetCounter.count(scrambledCharacters);
		try (LineIterator lineIterator = FileUtils.lineIterator(wordList)) {

			while (lineIterator.hasNext()) {
				String currentWord= lineIterator.next().trim();
				int [] arr2 = AlphabetCounter.count(currentWord);
				if(Arrays.equals(arr1, arr2)) {
					retVal.add(currentWord);
					if(returnFirst) {
						return retVal;
					}
				}
				
			}
		}
		return retVal;
	}
	public static void main(String[] args) throws IOException {
		String scrambledCharacters = "applot";
		
		System.out.println(findAllWordsContainingCharacters(ConfigurationProperties.Download_Words_Into, scrambledCharacters,true));
	}
}
