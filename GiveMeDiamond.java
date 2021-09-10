package Competetive_Coding_Initiation;

import javax.management.MBeanAttributeInfo;

/*
Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.
Task
You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
Return null/nil/None/...
if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
Examples
A size 3 diamond:
+++++++++++++++++++++++++++++++
 *
***
 *
...which would appear as a string of " *\n***\n *\n"

A size 5 diamond:
+++++++++++++++++++++++++++++
  *
 ***
*****
 ***
  *

 */
public class GiveMeDiamond
{
    public static String print(int n)
    {
        if (n < 0 || n % 2 == 0) return null;
        String shape = "";
        int midRow = n/2 + 1;
        for (int i = midRow; i <= n*2 - midRow; i++)
        {
            for (int j = 1; j <= n - Math.abs(n - i); j++)
            {
                if (j <= Math.abs(n - i))
                    shape += " ";
                else
                    shape += "*";
            }
            shape += "\n";
        }
        return shape;
    }
    //

    public static String print1(int n) {
        if (n % 2  == 0 || n <= 0)//checking remainder
        {
            return null;
        }
        StringBuffer expected = new StringBuffer();
        for (int i = 1; i <= n; i+=2)
        {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        for (int i = n - 2; i >= 1; i-=2)
        {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        return expected.toString();
    }
    //
    public static String prin2t(int n) {
        if(n<0 || n%2==0)
            return null;
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<n;i++)
          //  result.append(" ".repeat(Math.abs(n/2-i))).append("*".repeat(n-2*Math.abs(n/2-i))).append("\n");
            result.append(" ".repeat(Math.abs(n/2-i))).append("x".repeat(n-2*Math.abs(n/2-i))).append("\n");
        return result.toString();
    }
    //
    public static String print3(int n)
    {
        if (n <= 0 || n % 2 == 0)
        {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i+=2)
        {
            result.append(" ".repeat((n-i)/2));
            result.append("*".repeat(i));
            result.append("\n");
        }
        for (int i = n - 2; i >= 1; i-=2)
        {
            result.append(" ".repeat((n-i)/2));
            result.append("*".repeat(i));
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(print3(5));

    }


}
