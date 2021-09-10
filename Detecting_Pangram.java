package Competetive_Coding_Initiation;
import java.util.Arrays;
import java.util.Locale;

/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence
"The quick brown fox jumps over the lazy dog"
 is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
public class Detecting_Pangram
{
    public static boolean check(String sentence)
    {
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }

    //Alternate Solution
        boolean check1(final String sentence)
        {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
    //Alternate Solution
    public boolean check2(String sentence)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";  //must be all lowercase
        // create array of all characters
        String[] alphabet_chars = alphabet.split("");
        // make input lowercase also and sentence to array
        String[] sentence_chars = sentence.toLowerCase().split("");

        // check if sentence list of chars contains alphabet list of chars.
        boolean contains = Arrays.asList(sentence_chars).containsAll(Arrays.asList(alphabet_chars));

        if (!contains)
            return false;
        else
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(check("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        System.out.println(check("The quick brown fox jumps over the lazy dog"));

    }
}
