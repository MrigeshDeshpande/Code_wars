package Competetive_Coding_Initiation;

public class Getting_The_MiddleCharacter {
    public static String getMiddle(String str)
    {
        if(str.length()==1 || str.length()==2)
        {
            return str;
        }
        if (str.length()%2==0)
        {
            return "" +str.charAt((int) str.length()/2 -1) + str.charAt((int)str.length()/2);
        }
        else
        {
            return ""+str.charAt((int)str.length()/2);
        }
    }
    //Alternate Method
    public static String getMiddle1(String word) {

        StringBuilder sb = new StringBuilder("");
        if(word.length() == 1 || word.length() == 2)
        {
            sb.append(word);
        }
        else if((word.length()%2) == 0)
        {
            sb.append(word.substring(word.length()/2-1,word.length()/2+1));
        }
        else
        {
            sb.append(word.substring(word.length()/2,word.length()/2+1));
        }
        String answer = sb.toString();
        return answer;
    }
    //

    public static String getMiddle2(String word)
    {
        int length = word.length();
        //System.out.println("length is"+length);
        int mid = length / 2;//checks quotient
       // System.out.println("mid value is "+mid);
        boolean isEven = length % 2 == 0;//checks remainder
        //System.out.println("the word is even :"+isEven);
        return isEven ?
                word.substring(mid - 1, mid + 1) :
                String.valueOf(word.charAt(mid));
    }
    //
    public static String getMiddle3(String word) {
        String s = "";
        int length = word.length();
        int half = length/2;
        if (length % 2 == 0)
        {
            s = word.substring(half - 1, half + 1);
        }
        else
        {
            s = word.substring(half, half + 1);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle3("sanjay"));
    }
}
