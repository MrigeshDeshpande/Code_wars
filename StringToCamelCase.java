package Competetive_Coding_Initiation;
/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */
public class StringToCamelCase
{
    public static String toCamelCase(String  str)
    {
        //creating stringbuilder to create our output string
        StringBuilder sb= new StringBuilder();

        //determine when the next capital letter will be
        Boolean nextCapital= false;

        //looping through the string
        for(int i=0;i<str.length();i++)
        {

            //if the current character is a letter
            if (Character.isLetter(str.charAt(i)))
            {
                //get the current character
                char temp =str.charAt(i);

                //make it capital if required at the index of every word
                if(nextCapital)
                    temp =Character.toUpperCase(temp);

                //now add to the output string(String builder)
                sb.append(temp);

                //make sure next word is not capital
                nextCapital=false;
            }
            else
            {
                //otherwise next letter should be capital
                nextCapital= true;
            }
        }

//now time to return output string
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

}
