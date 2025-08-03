import java.util.Arrays;
public class Method_Arrays {
    public static void main(String[] args) {
        //create array
        int[] arr={1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]=99;//if you make a change to the object via this ref. variable the same object will be changed
    }

}
