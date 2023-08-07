import java.util.Arrays;

public class Vector {
    private double magnitude;
    private double[] direction; //radians, fuck you

    public Vector(int dim) {
        this.magnitude = 0.0;
        this.direction = new double[dim - 1];
    }

    public Vector(double magnitude, double... direction) {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    //functional methods
    public Coordinate coordinateRepresentation() {
        int dimensions = direction.length + 1;
        double[] coords = new double[dimensions];

        double planeMagnitude = magnitude * Math.cos(direction[1]);

        coords[0] = planeMagnitude * Math.cos(direction[0]);
        coords[1] = planeMagnitude * Math.sin(direction[0]);
        coords[2] = planeMagnitude * Math.tan(direction[1]);
        return new Coordinate(coords);
    }

    public Vector add(Vector addend) {
        Coordinate a = coordinateRepresentation();
        Coordinate b = addend.coordinateRepresentation();

        return (a.add(b)).vectorRepresentation();
    }

    public Vector add(Vector[] addend) {
        Vector sum = new Vector(magnitude, direction);
        for(Vector v : addend) {
            sum = sum.add(v);
        }
        return sum;
    }

    public Vector scale(double scalar) {
        return new Vector(this.magnitude*scalar, this.direction);
    }

    //getters and setters (fuck c#)
    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public double[] getDirection() {
        return direction;
    }

    public void setDirection(double... direction) {
        this.direction = direction;
    }

    // toString
    public String toString() {
        return "[Magnitude: " + magnitude + ", Direction: " + Arrays.toString(direction) + "]";
    }
}
