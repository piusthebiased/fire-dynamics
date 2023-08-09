package math;

public class ColumnMatrix extends Matrix {
    private final int dim;

    public ColumnMatrix(int dim) {
        super(dim, 1);
        this.dim = dim;
    }

    public ColumnMatrix(double[] data) {
        super(data.length, 1);
        for(int i = 0; i < data.length; i++) {
            super.setIndex(data[i], i, 0);
        }
        this.dim = data.length;
    }

    public double[] getData() {
        double[] d = new double[dim];
        for(int i = 0; i < dim; i++) {
            d[i] = super.getIndex(i, 0);
        }

        return d;
    }
}
