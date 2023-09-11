package tcsnqt;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputSentence = "Hi this is SelvamFNGCDonWarrior Jothiprakash T!";
		String[] inputSentenceword = inputSentence.split(" ");
		int longestWord = findLongestWord(inputSentenceword);
		System.out.println(longestWord);
	}

	private static int findLongestWord(String[] inputSentenceword) {
		// TODO Auto-generated method stub
		int lenOfLongestWord = 0;
		for (int i = 1; i < inputSentenceword.length; i++) {
			if (inputSentenceword[i].length() > inputSentenceword[i - 1].length()) {
				lenOfLongestWord = inputSentenceword[i].length();
			}
		}

		return lenOfLongestWord;
	}

}
