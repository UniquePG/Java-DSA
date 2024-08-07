import java.util.Scanner;

public class Methods {

    // method without return type
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The Sum = "+ sum);
        return;
    }

    // method with return type
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a+b;
        // System.out.println("The Sum = "+ sum);
        return sum;
    }

    static int sum3(int a, int b){

        return a+b;
    }

    public static void main(String[] args) {
        
        // without return
        // sum();

        // function with return 
        // int ans = sum2();
        // System.out.println("The Sum2 = "+ ans);
        
        // function with return 
        int ans = sum3(3, 7);
        System.out.println("The Sum3 = "+ ans);


        /// block scope

        int a = 100;        // it already initialized in the parent block

        {
            // int a = 200;            // we can not reinitalized in the block
            a = 88;             // we can modify it

            int c = 133;
        }

        System.out.println(a);  
        // System.out.println(c);  // we can not access it here




    }
}
