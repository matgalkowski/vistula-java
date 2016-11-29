package homework.first;

/**
 * Created by matgalkowski on 27.11.2016.
 */
public class Palindrome {
    public static boolean checkIfPalindrome(String word) {
        word = word.trim().toLowerCase();
        if(word.isEmpty())
            return false;
        String reversedWord = new StringBuffer(word).reverse().toString();
        return reversedWord.equals(word);
    }
}
