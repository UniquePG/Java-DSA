import java.util.Arrays;

public class ques {

    public static void main(String[] args) {
        // swap the items in array
        int[] arr = { 33, 42, 54, 20, 22, 12};

        swap(arr, 0, 3);       
        
        // System.out.println(Arrays.toString(arr));


        // find the maximum number from the array
        int[] arr2 = {3, 33, 54, 12, 83, 2, 31, 10};

        // System.out.println(findMax(arr2));
        // System.out.println(findMaxbetweenrange(arr2, 5, 7));

        /// reverse the array
        reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void reverseArray(int[] arr){

        int start = 0;
        int end = arr.length -1;

        // while (start < end) {
        //     swap(arr, start, end);

        //     start++;
        //     end--;
        // }

        for (int i = 0; i < end; i++) {
            swap(arr, i, end);
            end--;
        }

    }


    static int findMaxbetweenrange(int[] arr, int i1, int i2){
        int max = arr[i1];

        for (int i = i1; i <= i2; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

        }
        
        return max;
    }

    static int findMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

        }
        
        return max;
    }

    // swap the array elements
    static void swap( int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
