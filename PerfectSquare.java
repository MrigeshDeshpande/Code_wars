package Competetive_Coding_Initiation;

import java.util.Scanner;

/*You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know,
whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.
 */
public class PerfectSquare
{
    public static int isSquare()
    {
    System.out.println("Enter the number you wish to check to be perfect Sqaure");
    Scanner sc = new Scanner(System.in);
    int  number=sc.nextInt();

    //now finding sqaure root
    int sqrt=(int)Math.sqrt(number);
    if (sqrt*sqrt==number)
    {
        System.out.println(number+" is a perfect square !!");
    }
    else
    {
        System.out.println(number + " is not a perfect square!!");
    }

    return 0;
}

    //when just to show true and false
    public  static boolean isSquare(int n)
    {
        int sqrt= (int)Math.sqrt(n);
        if (sqrt*sqrt==0)
        {
            return true;
        }
        else
        return false;
    }


    public static void main(String[] args)
    {
        //isSquare();
        isSquare(25);
    }


}
