import org.junit.jupiter.api.Test;
import vector.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    @Test
    //the following method tests the .fromPolar method in the vector class
    //we represent the vector as an n-sphere with a given magnitude.
    public void testPolarOnBasisVectors() {
        // test one, basis \theta_0 [^1]
        Vector v = Vector.fromPolar(1, 0.5 * Math.PI, 0);
        assertArrayEquals(new double[]{0, 1, 0}, v.getData());

        v = Vector.fromPolar(1, Math.PI, 0);
        assertArrayEquals(new double[]{-1, 0, 0}, v.getData());

        v = Vector.fromPolar(1, 1.5*Math.PI, 0);
        assertArrayEquals(new double[]{0, -1, 0}, v.getData());

        // test two, basis \theta_1 [^2]
        v = Vector.fromPolar(1, 0, 0.5 * Math.PI);
        assertArrayEquals(new double[]{0, 0, -1}, v.getData());

        v = Vector.fromPolar(1, 0, Math.PI);
        assertArrayEquals(new double[]{0, -1, 0}, v.getData());
    }
}

/*
 * [^0]  An n-sphere is the group of all of the spherical spaces.  n, quantifies
 *       the amount of directions that the sphere can hold.  For instance, a 1-sphere
 *       describes a spherical space in which there is a magnitude, r, and a singular
 *       direction, \theta.  A 5-sphere describes a spherical space in which there is
 *       (, again,) a magnitude, m, and five directions (\theta{0..4}).
 *
 * [^1]  For a given sphere, \theta_0 contains relations from (x, y) - x and y being
 *       basis dimensions for the vector.  Theoretically, magnitude shouldn't matter
 *       since it's a *magnitude*, we could literally scale the vector however we need
 *       it, by multiplying each component in the column matrix, which is intrinsic
 *       in the Vector class.
 *
 * [^2]  For a given spacial n-dimensional plane, we represent the set of directions
 *       ($$d = \lbrace (\theta_{n-1}, \theta_{n-2}, ..., \theta_{0}) \rbrace$$) with
 *       the following restrictions:
 *          1. for \theta_0, we restrict for [0, 2\pi), and
 *          2. for \theta_1 to \theta_{n-1}, we restrict for [0, \pi]
 *       These restrictions are necessary to ensure that a specific direction will only
 *       map to two dimensions.  For an intuitive example, consider a sphere that uses
 *       the directions \theta to describe the (x, y) axes, and \phi to describe the (y, z)
 *       axis. This might be a stretch, but consider a magic vector that clones itself to
 *       create a subset of a plane (a shape).  For instance, if we had this magic vector on
 *       the unit circle (starting at \theta=0) and we rotate it by $$\frac{\pi}{4}$$, we
 *       would have a semi-circle.
 *
 *       With this visualization framework in mind, consider a 0-sphere. We navigate this
 *       unit 0-sphere by the magnitude (in particular, the magnitude's sign), since there's
 *       no direction to vary - making the possible points binary {n, -n}.  We transform this
 *       to the two-dimensional spherical representation (a circle) by adding direction as a
 *       quantity.  To create the circle, all we need to do is rotate the magic vector by
 *       2\pi, since it will clone itself as it rotates. It's important to note that this dire-
 *       ction represents the variance between the x and y axes Now, we have a circle of magic
 *       vectors. We can now map a 2-sphere by rotating the circle by \pi radians. Note how we
 *       do not need to rotate the sphere by more than \pi, as this will overlap with the prev-
 *       iously cloned magic vectors, which is why we restrict the domain of the second rotation
 *       by [0, pi]. This logic applies to the nth direction (after direction_1).
 */