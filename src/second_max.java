import java.util.*;
public class second_max {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        n=sc.nextInt();
        System.out.print("enter the elements of an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int largest = arr[0];
        int second_largest = Integer.MIN_VALUE;
        int smallest=arr[0];
        int second_smallest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest) {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > second_largest){
                second_largest=arr[i];
        }
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                second_smallest = smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<second_smallest)
            {
                second_smallest=arr[i];
            }
        }
        System.out.println("the second largest elements is: "+ second_largest);
        System.out.println("the second smallest elements is: "+ second_smallest);

    }
}
