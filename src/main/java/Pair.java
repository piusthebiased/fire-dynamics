public class Pair {
    public double x;
    public double y;

    public Pair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector vectorRepresentation() {
        return new Vector(Math.sqrt(x*x + y*y), Math.atan2(y, x));
    }
}
