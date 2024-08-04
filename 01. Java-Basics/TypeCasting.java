import java.util.Scanner;

public class TypeCasting {

    /* 
        Type Conversion
            - Type should be compatible
            - destination type should be greater than source type ( left side type > right side type)
            - it happend automatically by java
        
        type Casting
            - convert smaller type into bigger type
            - we have to do it mannually

     
     */



    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // type conversion
        int decimal = input.nextInt();  //-> if we give floting number it convert into float
        System.out.println(decimal);

        // int num = input.nextFloat(); // it gives error

        
        //Type casting
        // int num = (int)(65.25f);    // manuallt convert datatype  // 65

        // int bb = Integer.parseInt("565.255");






    }
}
