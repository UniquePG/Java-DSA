import java.util.Arrays;
import java.util.Scanner;

public class Array_basics {
    public static void main(String[] args) {
        

        // array -> it stores sigle data types values
        /* 
         datatype[] variable_name = new datatype[size];
                OR
        datatype[] variable_name = { value, value, ....};  
         */


            //----array of primitives
         int[] arr1 = new int[5];       // declair 5 size array ( all values are 0 by default, null in String)

         int[] arr2 = {32, 43, 54, 122, 22};   // array with value

         int[]  arr3; // declaration -> arr3 is defined in the stack // at compile time
         arr3 = new int[6]; // initialisation -> here the array object is created in the heap memory // at runtime ( called dynamic memory allocation)
         

         String[] sarr = new String[4];

        // taking array input
        int[] arrinput = new int[5];

        // arrayInput(arrinput);       // taking input from user

        // for(int i = 0; i < arrinput.length; i++ ){
        //     System.out.print(arrinput[i] + " ");
        // }

        // enhanced for loop to itirate an array
        for(int value : arrinput){
            System.out.print(value + " ");
        }

        System.out.println("arrays: "+ Arrays.toString(arrinput));   // another method to print array


            //-----Array of objects
        String[] arrstr = new String[4];

        arrayStrInput(arrstr);

        System.out.println(Arrays.toString(arrstr));
         
    }


        // taking the array of string input
        static void arrayStrInput(String[] arr){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input "+ arr.length + " elements: ");
    
            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.next();
            }
        }
    
    

    // taking the array input
    static void arrayInput(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input "+ arr.length + " elements: ");


        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }



}
