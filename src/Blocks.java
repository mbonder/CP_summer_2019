public class Blocks {

    //3 types of visibility (private, [nothing], public)
    private static int d = 6; // it will be visible only if class you want to import variable d into is in the same package!

    public static void myProcedure() {
        System.out.println(d);
        //System.out.println(a);

    }

   public static int myFunc(int a) {
        return a*10;
   }



    public static void main(String[] args) {
        int a = 5;
        myProcedure();
        myFunc(7);
        //System.out.println(d);
        {
            int b = 7;
            System.out.println(a);  //the variables wont print outside of a block they were defined in or in its children blocks
            System.out.println(b);  // dont define everything at the same time if you are not using it
            {
                int c = 7;
                System.out.println(a);
                System.out.println(b);
            }
        }
        //System.out.println(a);
        //System.out.println(b);  those wont print
        //System.out.println(c);
    }
}


//DO SPRAWDZENIA
