import vector.Force;
import vector.Vector;

import java.util.ArrayList;

public class Particle {
    private Vector x;                   //position
    private Vector v;                       //velocity
    private ArrayList<Force> forces = new ArrayList<>();   //queue of appliable forces

    public Particle() {
        this.x = new Vector(3);
        this.v = new Vector(3);
    }

    public Particle(Vector x, Vector v) {
        this.x = x;
        this.v = v;
    }

    //functional methods
    public void addForce(Force f) {
        forces.add(f);
    }

    //TODO: add tick as variable
    public void onTick() {
        v.add(Force.toArray(forces));
        x.add(v);
        forces.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"position\": ").append(x.toString());
        sb.append(", \"velocity\": ").append(v.toString());
        sb.append(", \"forces\": ").append(forces.toString());
        sb.append("}");
        return sb.toString();
    }

    //getters and setters
    public Vector getX() {
        return x;
    }

    public void setX(Vector x) {
        this.x = x;
    }

    public Vector getV() {
        return v;
    }

    public void setV(Vector v) {
        this.v = v;
    }

    public ArrayList<Force> getForces() {
        return forces;
    }

    public void setForces(ArrayList<Force> forces) {
        this.forces = forces;
    }
}
