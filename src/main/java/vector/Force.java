package vector;

import java.util.ArrayList;

public class Force extends Vector {
    public Force(int dim) {
        super(dim);
    }

    //static methods
    public static Force[] toArray(ArrayList<Force> f) {
        Force[] arr = new Force[f.size()];
        f.toArray(arr);

        return arr;
    }
}
