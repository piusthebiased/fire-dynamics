package vector;

import math.ColumnMatrix;

public class Coordinate {
    private double[] coords;

    public Coordinate(int dim) {
        coords = new double[dim];
    }
    public Coordinate(double... coords) {
        this.coords = coords;
    }

    //functional methods
    public Vector vectorRepresentation() {
        return new Vector(new ColumnMatrix(coords));
    }

    public Coordinate add(Coordinate addend) {
        double[] sum = new double[coords.length];
        for(int i = 0; i < coords.length; i++) {
            sum[i] = coords[i] + addend.getComponent(i);
        }
        return new Coordinate(sum);
    }

    //getters and setters
    public double[] getCoords() {
        return coords;
    }
    public double getComponent(int i) {
        return coords[i];
    }

    public void setCoords(double[] coords) {
        this.coords = coords;
    }

    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(double d : coords) {
            sb.append(d).append(", ");
        }
        sb.replace(sb.length()-2, sb.length()-2, "]");

        return sb.toString();
    }
}
