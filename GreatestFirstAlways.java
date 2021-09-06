package Competetive_Coding_Initiation;

import java.util.Arrays;

public class GreatestFirstAlways {
    public static int desc()
    {

        int temp;
        int[] shunya =new int[] {20,58,78,46,1,649,1487,169};

        for (int i=0;i<shunya.length;i++)
        {
            for (int j=i+1;j< shunya.length;j++)
            {
                if (shunya[i]<shunya[j])
                {
                    temp =shunya[i];
                    shunya[i]=shunya[j];
                    shunya[j]=temp;
                }
            }

        }
        //now accessing the element
        for (int i=0;i<shunya.length-1;i++)
        {
            System.out.println(shunya[i]);
        }
        return 0;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------
    public static int asc()
    {
        //creating an instance of an array
        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");
//sorting logic
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(arr[i]);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(desc());
        System.out.println(asc());
    }

}
