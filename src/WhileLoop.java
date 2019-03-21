public class WhileLoop {

    public static void main(String[] args) {

        int i = 2; //if the conditions doesnt match it wont print
        while (i < 5) {
            System.out.println("i=" +i);
            if (i==3) break;
            i++; // if we dont add this line the loop will run forever

        }

        int j = 10; // this loop will always print at least once, it first prints a value and then check if the conditions match
        do {
            System.out.println("j=" +j);
            j++;
        } while (j<5);

    }
}
