package Competetive_Coding_Initiation;
import java.util.ArrayList;
import java.util.List;

/*
In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
Rules
 1.  The input string will always be lower case but maybe empty.
 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
Example
wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */
public class MexicanWave
{
    public static String[] wave(String str)
    {
        ArrayList<String> result = new ArrayList<String>();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isSpaceChar(str.charAt(i))) continue;
            result.add(str.substring(0, i) +
                            Character.toUpperCase(str.charAt(i)) +
                            str.substring(i+1, str.length())
            );
        }
        return result.toArray(new String[result.size()]);
    }
    public static String[] wave1(String str) {
        // Your code here

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
        }
        return list.toArray(new String[0]);


        //return new String[] {};
    }


    public static String[] wave2(String str) {
        List<String> list = new ArrayList<>();
        String current; // for readability
        for (int i = 0; i < str.length(); i++)
        {
            current = str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1);
            if (str.charAt(i) != ' ') list.add(current);
        }
        return list.toArray(String[]::new);
    }


    public static void main(String[] args)
    {
        System.out.println(wave1("hello"));
    }
}
