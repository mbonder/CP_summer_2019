public class Arrays {
    public static void main(String[] args) {
        //int[] intArr = new int[5];    //ask whats is the difference between this and bottom line
        Integer[] intArr = new Integer[5];
        intArr[0] = 567;
        intArr[1] = 968;
        intArr[2] = 675;


        String[] strArr = new String[] {
                    "ABC",
                    "DEF",
                    "EFG"
        };

        for (int i = 0; i<intArr.length;i++) {
            //if (intArr[i]!= null) only for object oriented type
                System.out.println(i + " element: " + intArr[i]*10);
        }

    //For Each Loop
        for (int myEL : intArr) { // for int, also works if you change int to Integer
            System.out.println(myEL);
        }

        for (String e1 : strArr) {
            System.out.println("My strArr element: " + e1);
        }



    }
}
