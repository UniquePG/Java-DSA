import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // System.out.println(isPrime(n));


        //-----print all armstrong number
        for (int i = 100; i < 1000; i++){
            
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }


        // System.out.println("is Armstrong: "+ isArmstrong(n));



    }    

    // check the number is armstrong or not ( 3 digit number)
        // armstrong number -> if the sum of cube of each digit of the number is equal to the original number
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;       // get the last digit of number
            
            sum += rem * rem * rem;     // add the cube of digit in the sum

            n = n / 10;       // remove the last digit from the num
        }

        return sum == original;
    }


    // check prime number
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        int x = 2;
        while (x * x <= num){
            if(num % x == 0){
                return false;
            }
            x++;
        }

        // if( x * x > num){
        //     return false;
        // }
        // return true; 

            //------ short
    
        return x * x > num;
    }
}
