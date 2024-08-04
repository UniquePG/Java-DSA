// The public class name should be same as .java file name

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        System.out.println("How are you?");

        // taking input 
        Scanner input = new Scanner(System.in);  // System.in -> it means we take input from the keyboard (system)
        System.out.println(input.nextInt());  // nextInt -> take integer in next line

            /* 
             nextInt() -> take integer
             next() -> take string(first word only)
             nextLine() -> take string(whole sentence)
             nextFloat() -> take floating number
             */

    }
}