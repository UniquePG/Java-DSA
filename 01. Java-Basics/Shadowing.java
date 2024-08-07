public class Shadowing {

    static int x = 100;     /// this variable will be shadowed at line 9
    static int y = 200;

    public static void main(String[] args) {

        System.out.println(x);      // x = 100

        int x = 40;         // this variable is overlap the global variable 
            
        System.out.println(x);      // x = 40

        int y;      // scope of y is not begin here
        // System.out.println(y);  // gives error

        y = 50;         // scrop will begin when the value is initialized
        System.out.println(y);
    }
}
