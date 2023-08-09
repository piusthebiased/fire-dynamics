package math;

public class Iterable {
    public static double summate(double... in) {
        double sum = 0.0;
        for(double x : in) {
            sum += x;
        }

        return sum;
    }

    public static void adjustRounding(double[] x) {
        for(int i = 0; i < x.length; i++) {
            double bounds = Math.abs(x[i] - (int)x[i]);

            if(bounds > 0.999999999 || bounds < 0.000000001) x[i] = Math.round(x[i]);
        }
    }
}
