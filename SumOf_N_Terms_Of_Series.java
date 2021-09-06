package Competetive_Coding_Initiation;
import java.util.*;
//06/09/21
/*
Your task is to write a function which returns the sum of following series upto nth term(parameter).
Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

Rules:
You need to round the answer to 2 decimal places and return it as String.
If the given value is 0 then it should return 0.00
You will only be given Natural Numbers as arguments.
 */
public class SumOf_N_Terms_Of_Series
{
    //logic of hp series
    public static String seriesSum(int n) {
        double sum = 0;
        if (n == 0)
        {
            return String.valueOf(sum);
        }
        else
        {
            for (int i = 0; i < n; i++)
            {
                sum += Double.valueOf(1) / Double.valueOf(1+i*3);
            }
            return String.format("%.2f", sum);
        }
    }

    //ALTERNATE METHOD:

    public static String seriesSum1(int n) {

        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);
        return String.format("%.2f", sum);

    }
    //2
    public static String seriesSum2(int n)
    {
        double result = 0;
        int i = 0;
        int b = 1;
        int diff = 3;
        while (i != n)
        {
            result += 1.0/b;
            System.out.println("result is "+result);
            b += diff;
            System.out.println("b is "+b);
            System.out.println("i here is"+i);
            i++;
            System.out.println("i is "+i);
        }

        return String.format(Locale.US, "%.2f", result);
    }
    public static String seriesSum3(int n)
    {
        double result = 0;
        int i = 0;
        int b = 1;
        int increase = 3;
        while (i != n){
            result += 1.0/b;
            b += increase;
            i++;
        }
        return String.format("%.2f", result);
    }

    public static String seriesSum4(int n)
    {
        float result = 0;
        for (int i = 1; i <= n; i++)
        {
            result += number(i);
        }

        return String.format("%.2f", result);
    }

    private static float number(int n) {
        return 1 / (4 + ( (float)n - 2 ) * 3);
    }
//************************************************************************************
    public static void main(String[] args)
    {
        System.out.println(seriesSum2( 5));

    }

}
