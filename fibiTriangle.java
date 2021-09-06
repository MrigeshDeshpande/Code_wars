package Competetive_Coding_Initiation;

public class fibiTriangle
{
    public static void fib(int f[],int N)
    {
        f[1]=1;
        f[2]=1;
        for (int i=3;i<=N;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
    }

    public static void fibotriangle(int n)
    {
        int N=n*(n+1)/2;
        int f[]= new int[N+1];
        fib(f,N);

        int fibonum=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(f[fibonum++]+"");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int n=10;
        fibotriangle(n);
    }

}
