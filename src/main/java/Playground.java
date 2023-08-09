import vector.Coordinate;
import vector.Force;
import vector.Vector;

public class Playground {
    public static void main(String[] args) {
        //first test, should print out [0, -1, 0]
        System.out.println("TEST ONE: ");
        Vector a = new Vector(1.0, 1.5 * Math.PI, 0.0);
        System.out.println(a);  // prints out vector form
        System.out.println(a.coordinateRepresentation());  //coordinate form
        System.out.println(a.coordinateRepresentation().vectorRepresentation());  //back to vector

        //1.5 test
        System.out.println((new Coordinate(a.coordinateRepresentation().getCoords())).vectorRepresentation());
        System.out.println(a.add(Vector.fromPolar(1.0, 1.5 * Math.PI, 0.0)));


        //second test
        System.out.println("\n");
        System.out.println("TEST TWO: ");
        Particle p = new Particle();
        System.out.println("initial state: \t" + p);

        p.addForce(new Force(9.8, 1.5 * Math.PI, 0.0));
        System.out.println("added force: \t" + p);

        p.onTick();
        System.out.println("after state: \t" + p);
    }
}
