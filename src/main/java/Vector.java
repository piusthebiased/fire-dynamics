public class Vector {
    private double magnitude;
    private double direction; //radians, fuck you

    public Vector(double magnitude, double direction) {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    //functional methods
    public Pair coordinateRepresentation() {
        return new Pair(Math.cos(direction) * magnitude, Math.sin(direction) * magnitude);
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

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }
}
