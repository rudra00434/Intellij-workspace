public class Fast_power {
    public static void main(String[] args) {
        System.out.println(power(3,5));

    }
    static int power(int a,int b)
    {
        int res=1;
        while(b>0)
        {
            if((b & 1)!=0)
            {
                res=res*a;
            }
            a=a*a;
            b=b>>1;
        }
        return res;

    }

}
