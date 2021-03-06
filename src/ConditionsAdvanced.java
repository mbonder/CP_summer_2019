import java.util.HashMap;
import java.util.Map;

public class ConditionsAdvanced {

    public static void main(String[] args) {
        int a = 3;
        String astr = a > 4 ? "A is greater than 4"
                : "A is not greater than 4";
        System.out.println(astr);

        String v = "C";

        switch (v) {
            case "A":
                System.out.println("v is A");
                break; //check without break -> somethong changes and its important
            case "B":
                System.out.println("v is B");
                break;
            default:
                System.out.println("v is neither A or B");
        }


        Map<String, String> myMap = new HashMap<>();
        myMap.put("A", "v is A");
        myMap.put("B", "v is B");
        myMap.put("C", "v is C");

        v = "B"; // if we chose something taht does not is in the map then the console will pront "null"
        String res = myMap.get(v);
        if (res == null) {
            System.out.println(v + " is not in map");
        } else {
            System.out.println(v + " is in the map");
        }
    }
}