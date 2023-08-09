package vector;

import math.ColumnMatrix;
import math.Iterable;

//mathematical consistency [^0]
public class Vector extends ColumnMatrix{
    //constructors [^1]
    public Vector(int dim) {
        super(dim);
    }
    public Vector(double[] d) {
        super(d);
    }
    public Vector(ColumnMatrix mat) {
        super(mat.getData());
    }

    //functions
    public Coordinate coordinateRepresentation() {
        return new Coordinate(super.getData());
    }

    //static variables
    public static Vector fromPolar(double magnitude, double... direction) {
        double[] comp = new double[direction.length + 1];

        // iterable
        double hyp_n = magnitude;   // first hypotenuse is original magnitude
        for(int i = 0; i < direction.length; i++) {
            comp[i] = hyp_n * Math.sin(direction[i]);
            hyp_n *= Math.cos(direction[i]);            // subsequent components along planes become hypotenuse
        }
        comp[comp.length - 1] = hyp_n;
        Iterable.adjustRounding(comp);

        return new Vector(comp);
    }
}

/*
 * [^0]  A vector can (and is) represented as a column matrix, as we can have each component
 *       of the vector be an element of the column vector, hence why the Vector class extends
 *       the ColumnMatrix class.
 *
 *
 */
