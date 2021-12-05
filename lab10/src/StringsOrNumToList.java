import java.util.ArrayList;
import java.util.Arrays;

public class StringsOrNumToList {
    public static ArrayList<Object> convert(Object[] arr){
        return new ArrayList<Object>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        String[] arrStrings = new String[] {"wind", "fire", "water", "earth"};
        Integer[] arrInts = new Integer[] {1, 3, 5, 4};

        ArrayList<Object> result = convert(arrStrings);
        for (Object o : result) {
            System.out.println(o);
        }

        result = convert(arrInts);
        for (Object o : result) {
            System.out.println(o);
        }
    }
}
