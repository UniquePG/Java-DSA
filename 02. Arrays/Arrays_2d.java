import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2d {
    public static void main(String[] args) {
        
        /* 
            1 2 3
            4 5 6
            7 8 9 
         */
        Scanner sc = new Scanner(System.in);

        //  int[][] arr = new int[3][4];       // first [size]-> no. of rows(mandatory), second [size] -> no. of colums(not mandatory
         
        int[][] arr = {
            {2, 3, 5},
            {4,6,7},
            {8,22, 12}
        };

        // System.out.println(arr[1][2]);  // -> 7

        int[][] arr2 = {
            {2, 3, 4},  // 0th index
            {4,6}, // 1th index
            {7,22, 12, 55} // 2th index  -> arr2[2] -> [7 ,2, 12, 55]
        }; 
        

        int[][] arr3 = new int[3][2];
        // System.out.println(arr3.length); /// -> it will give the length of the rows (3)

        // take 2d array input
        for (int row = 0; row < arr3.length; row++) {
            // now we will run the loop for each row(for each row length)
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = sc.nextInt();
            }
            
        }

        // printing the 2d array
        // for (int row = 0; row < arr3.length; row++) {
        //     // now we will run the loop for each row(for each row length)
        //     for (int col = 0; col < arr3[row].length; col++) {
        //         System.out.print(arr3[row][col] + " ");
        //     }

        //     System.out.println();
            
        // }

        // another way to print 2d array
        // for (int i = 0; i < arr3.length; i++) {
        //     System.out.println(Arrays.toString(arr3[i]));
        // }

        // another way (inhanced for loop)
        for(int[] a : arr3){    // beause inthe  2d array every element in the outer array is also an array 
            System.out.println(Arrays.toString(a));
        }

    }   

}
