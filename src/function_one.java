import java.util.Scanner;
public class function_one {
    public static class Sum_one{
       public int a;
       public int b;
       public void init(int m,int n)
       {
           a=m;
           b=n;
       }
       public int show()
       {
           int sum;
           sum = this.a+this.b;
           return sum;
       }
       public double div()
       {
           double div;
           if(this.a!=0 || this.b!=0)
           {
               div= (double)(this.a)/(this.b);
           }
           else {
               System.out.println("division with zero gives undefined");
               return 0;
           }
           return div;
       }


    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        x=sc.nextInt();
        System.out.println("enter the 2nd number: ");
        y=sc.nextInt();
        Sum_one myobj = new Sum_one();
        myobj.init(x,y);
        int result=myobj.show();
        double result_one=myobj.div();
        System.out.println("the sum of two nos is: "+result);
        System.out.println("the division of two number is: "+result_one);


    }
}
