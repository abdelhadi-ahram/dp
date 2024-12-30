package exam;

public class ActivationFunctionAdapter implements ActivationFunction{
    private LegacyActivationFunction legacyActivationFunction;

    public ActivationFunctionAdapter(LegacyActivationFunction legacyActivationFunction) {
        this.legacyActivationFunction = legacyActivationFunction;
    }

    @Override
    public double activate(double weightedSum) {
        return legacyActivationFunction.activateOutput(weightedSum);
    }
}
