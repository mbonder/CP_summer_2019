package pl.waw.sgh.shapes;

public class Triangle extends Shape {
    public Triangle(double parA, double parB) {
        super(parA, parB);
    }

    public double calcSurface() {
        return parA*parB*0.5;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side " + parA +
                ", height " + parB +
                '}';
    }
    public Triangle(double parA) {
        super(parA);
    }
}


