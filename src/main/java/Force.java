public class Force {
    private Vector f;

    public Force(double mass, Vector accel) {
        this.f = accel.scale(mass);
    }

    public Vector getForce() {
        return f;
    }

    public void setForce(Vector f) {
        this.f = f;
    }
}
