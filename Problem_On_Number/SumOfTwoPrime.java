package Problem_On_Number;

public class SumOfTwoPrime {
 static boolean prime (int n)
 {
    if (n<= 1)
    {return false;}
    for ( int i = 2; i*i<=n ; i ++)
    {
        if (n%i == 0)
        { return false;}

    } return true;}
    static boolean isprime (int n)
    {
        if ( prime(n) && prime (n - 2 ))
        { return true;}
        else {return false;}
    }

    public static void main ( String [] args )
    {
        int n = 26;
        if(isprime(n))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");

        }
    }
}
