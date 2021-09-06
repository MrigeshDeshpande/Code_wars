package Competetive_Coding_Initiation;
/*
You might know some pretty large perfect squares. But what about the NEXT one?

Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
 */
public class nextPerfectSquare
{
    public static long findNextSquare(int sq)
    {
        int a=0;
        for(int i=1;i<sq;i++)
        {
            if(sq/i ==i & sq%i ==0)
            {
                a=i;
                return ((a+1)*(a+1));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       // findNextSquare(25);
        System.out.println(findNextSquare(25));
    }
}
