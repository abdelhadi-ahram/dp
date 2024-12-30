package exam;

public class SoftMax implements ActivationFunction {
    public double activate(double weightedSum) {
        return Math.exp(weightedSum);
    }
}
