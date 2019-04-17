package pl.waw.sgh.shapes;

public class EqTriangle extends Triangle {
    public EqTriangle(double parA) {
        super(parA);
    }


    public double calcSurface() {
        return Math.pow(parA, 2) * Math.sqrt(3) * 0.25;
    }

    @Override
    public String toString() {
        return "Equilateral Triangle{" +
                "side " + parA +
                '}';
    }
}