import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number: ");
       n=sc.nextInt();
       check(n);

    }
    static int digit(int n)
    {
        int count =0;
        int num=Math.abs(n);
        while(num>0)
        {
            num=num/10;
            count++;
        }
        return count;
    }

    static void check(int n)
    {
        int  sum=0;
        int Digit=digit(n);
        int  temp=n;
        while(temp > 0)
        {
            int rem = temp % 10 ;
            sum  += (int) Math.pow(rem,Digit);
            temp = temp /10;

        }
        if(sum==n)
        {
            System.out.println("the number is Armstrong");
        }
        else
        {
            System.out.println("the number is not an armstrong");
        }
    }

}
