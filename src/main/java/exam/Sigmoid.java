package exam;

public class Sigmoid implements ActivationFunction{
    public double activate(double weightedSum) {
        return 1 / (1 + Math.exp(-weightedSum));
    }
}
