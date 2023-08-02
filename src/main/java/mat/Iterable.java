package mat;

public class Iterable {
    public static double summate(double... in) {
        double sum = 0.0;
        for(double x : in) {
            sum += x;
        }

        return sum;
    }
}
