package pl.waw.sgh.shapes;

import pl.waw.sgh.shapes.Shape;

public class Circle extends Shape {
    public Circle(double parA) {
        super(parA);
    }

    public double calcSurface() {
        return Math.PI*Math.pow(parA,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "parA=" + parA +
                '}';
    }
}