package Competetive_Coding_Initiation;
/*
Consider an array/list of sheep where some sheep may be missing from their place.
 We need a function that counts the number of sheep present in the array (true means present).
 [true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
 */
public class ArrayOfBooleanValues 
{
    public int countSheeps(Boolean[] arrayOfSheeps)
    {
        int counter = 0;
        for (Boolean present : arrayOfSheeps)
        {
            if (present != null && present)
            {
                counter += 1;
            }
        }
        return counter;
    }
 
}
/*
//another solution=>

    {
        public int countSheeps (Boolean[]arrayOfSheeps)
        {
            int count = 0;
            for (Boolean sheep : arrayOfSheeps) {
                // using Boolean.TRUE first to avoid NPE
                if (Boolean.TRUE.equals(sheep))
                {
                    count++;
                }
            }
            return count;
        }
    }

 */

    
 
