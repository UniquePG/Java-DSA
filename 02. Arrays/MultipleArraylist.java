import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // array list of arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // taking the 2d arrylist input
        for (int i = 0; i < 3; i++) {  // initialize new array list in the arrylist
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }


        System.out.println(list);
    }
    
}
