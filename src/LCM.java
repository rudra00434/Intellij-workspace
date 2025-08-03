import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        a=sc.nextInt();
        System.out.println("enter 2nd number: ");
        b=sc.nextInt();
        int Lcm=(b * a)/gcd_two(a,b);
        System.out.println("the lcm of two number is: "+ Lcm);

    }
    static int gcd_one(int x,int y)
    {
                                     //method one using Euclid Algorithm
      while(y!=0)                   // gcd(a,b)=gcd(a%b,b) (Euclid Algo)
     {
         int temp=y;
          y=x % y;
          x=temp;

     }
     return x ;
  }

    static int gcd_two(int x,int y)
    {
        if(x==0)
        {                              // method two gcd(a,b) = gcd(a-b,b);
                                      // gcd(72,24) = gcd(48,24) = gcd(24,24) = gcd(0,24)= gcd(24)=> ans=24;
            return y;
        }
        if(y==0)
        {
            return x;
        }
        while(x!=y)
        {
            if(x>y)
            {
                x=x-y;
            }
            else {
                y=y-x;
            }
        }
        return x;
    }


}
