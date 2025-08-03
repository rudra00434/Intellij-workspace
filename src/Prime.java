import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        n=sc.nextInt();
        if(isprime(n))
        {
            System.out.println("the number is prime");
        }
        else {
            System.out.println("the number is not prime");
        }

    }
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        if(c*c > n)
        {
            return true;
        }
        return false;
    }

}
