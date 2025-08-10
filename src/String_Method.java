import java.util.Scanner;
public class String_Method {
    public static void main(String[] args) {
       int x,y;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first number:");
       x=sc.nextInt();
        System.out.println("enter the second number: ");
        y=sc.nextInt();
        String message = greet();
        System.out.println(message);
       int sum = sum3(x,y);
       System.out.println("the sum of two number is :" +sum);
    }
    static String greet()
    {

         String  greeting = "how are you";
        return greeting;
    }
    static int sum3(int a,int b)
    {
        int sum;
        sum=(a+b);
        return sum;
    }


}

