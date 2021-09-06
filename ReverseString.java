package Competetive_Coding_Initiation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//02-09-21 :Problem1
/*
Complete the solution so that it reverses all of the words within the string passed in.

Example:

"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */
public class ReverseString
{

    public static String reverse(String str)
    {
        List words= Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ",words);
    }

    public static void main(String[] args)
    {
        System.out.println(reverse("Tera naam Sarvesh hai"));
    }
}
