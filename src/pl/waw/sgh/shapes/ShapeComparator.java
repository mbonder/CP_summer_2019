package pl.waw.sgh.shapes;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        Double sumParso1 = Double.valueOf(o1.parA+o1.parB);
        Double sumParso2 = Double.valueOf(o2.parA+o2.parB);
        return sumParso1.compareTo(sumParso2);
    }

}
