package exam;

public class Sigmoid {
    public double activate(double weightedSum) {
        return 1 / (1 + Math.exp(-weightedSum));
    }
}
