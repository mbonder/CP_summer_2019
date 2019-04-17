package pl.waw.sgh.shapes;

public class Square extends Shape {
    public Square(double parA) {
        super(parA);
    }

    public double calcSurface() {
        return parA*parA;
    }

}
