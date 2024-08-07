import java.util.Arrays;

public class Varargs {
    // variable arguments -> when we dont know how many arguments will be passed



    public static void main(String[] args) {
        fun(4,6,7,44,65,344);

        multiple(10, 33, "sdfjkd", "dkfjdslkfj", "dfkdjkf");
    }

    // multiple args
    static void multiple(int a, int b, String ...vars){
        System.out.println(Arrays.toString(vars));
    }
    
    static void fun (int ...var){

        // all args takes as an array
        System.out.println("all args "+ Arrays.toString(var));
    }
}
