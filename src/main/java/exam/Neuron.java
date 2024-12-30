package exam;

public class Neuron {
    private double weight;
    private double bias;
    private double input;
    private double output;

    public Neuron(double weight, double bias) {
        this.weight = weight;
        this.bias = bias;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public void predict() {
        output = input * weight + bias;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double value) {
        this.output = value;
    }
}
