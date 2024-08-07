import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {
        /* 
         syntext
            ArrayList<datatype> var_name = new ArrayList<>();
            ArrayList<datatype> var_name = new ArrayList<datatype>(size);

            datatypes -> wrapper classes of primitive types
         */

         ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> listtt = new ArrayList<>(5);

         list.add(52);   /// we can add how many items we want
         list.add(2);
         list.add(545);
         list.add(58);

        //  System.out.println(list);  // it directly print the list

         // for update value
         list.set(3, 100);  // update 3 index with value 100

         list.remove(1);    // remove any index item

        // to get the item at any index
        System.out.println(list.get(4));  // give index 4 item 

            // take list input 
         Scanner sc = new Scanner(System.in);

         ArrayList<Integer> list2 = new ArrayList<>();

         for (int i = 0; i < 5; i++) {
            int value = sc.nextInt();
            list2.add(value);
         }

         System.out.println(list2);


    }
}
