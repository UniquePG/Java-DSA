import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods_Swap {


    static void swap(int x, int y) {        // will not change original values
        int temp = x;
        x = y;
        y = temp;

        /// this change will only be valid in this function scope only
    }


    // it will change the value
    static void change(int[] arr){
        arr[0] = 100;
    }
    
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        swap(a, b); // it is pass by value
        System.out.println("after swap "+ a + "" + b);      // value will not change6, 8


        int[] arr = {3, 5, 10, 22};

            ///------here the reference (reference of the array object) is passes as a value
        change(arr);        // it will change the value of array
        System.out.println("arr after change "+ Arrays.toString(arr));


    }
}
