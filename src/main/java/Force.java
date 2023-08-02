import java.util.ArrayList;
import java.util.Arrays;

public class Force extends Vector{
    public Force(double magnitude, double... direction) {
        super(magnitude, direction);
    }

    //static methods
    public static Force[] toArray(ArrayList<Force> f) {
        Force[] arr = new Force[f.size()];
        f.toArray(arr);

        return arr;
    }
}
