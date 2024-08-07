public class Overloading{

    // overloading -> function with name structure but different arguments (type or length)
    public static void main(String[] args) {

        fun(23);

        fun("my name");
        
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}