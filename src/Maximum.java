import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements in the array: ");
        for(int i=0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }

        }
        System.out.println("the largest element in the array is: " +max);
        System.out.println("the smallest element in the array is: "+min);
    }
}
