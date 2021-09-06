package Competetive_Coding_Initiation;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.StringJoiner;

/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
 */
public class Reverse_Every_Letter
{ public static String reverseWords(final String original)
    {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }
//alternate method
public static String reverseWords1(final String original)
{
    if(original.trim().isEmpty())
    {
        return original;
    }

    StringJoiner joiner = new StringJoiner(" ");
    for (String word : original.split(" "))
    {
        joiner.add(new StringBuilder(word).reverse().toString());
    }
    return joiner.toString();
}
//
public static String reverseWords2(final String original) {
    String[] sentence = original.split(" ");
    StringBuilder finalString = new StringBuilder();

    if (sentence.length == 0) return original;

    for (int i = 0; i < sentence.length - 1; ++i) {
        finalString.append(new StringBuilder(sentence[i]).reverse()).append(" ");
    }

    return finalString.append(new StringBuilder(sentence[sentence.length - 1]).reverse()).toString();
}
//
public static String reverseWords3(final String original)
{
    String[] words = original.split(" ");
    String reverseString = original;

    for (String word:words)
    {
        StringBuffer wordSb = new StringBuffer(word);
        StringBuffer reversWord = wordSb.reverse();
      reverseString = reverseString.replaceFirst(word,reversWord.toString());
    }
    return reverseString;
}

    public static void main(String[] args) {
        System.out.println(reverseWords3("mrigesh deshpande"));
    }
}
