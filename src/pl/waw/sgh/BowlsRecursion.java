package pl.waw.sgh; //other way to do bowling exercise, in row 0 you have 1 bowl etc etc

public class BowlsRecursion {

    private static int sumBowls(int row) {
        if (row == 0) return 1;
        else return sumBowls(row -1) + row;
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println("sum " + sumBowls(n));

    }
}
