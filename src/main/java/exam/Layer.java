package exam;

import java.util.ArrayList;
import java.util.List;

public class Layer extends AbstractLayer {
    private ActivationFunction activationFunction;
    private List<Neuron> neurons;

    public Layer(int neuronCount, ActivationFunction activationFunction) {
        this.activationFunction = activationFunction;
        for (int i = 0; i < neuronCount; i++) {
            neurons.add(new Neuron(0, 0));
        }
    }

    @Override
    void forward() {
        for (Neuron neuron : neurons) {
            neuron.predict();
            double output = neuron.getOutput();
            neuron.setOutput(activationFunction.activate(output));
        }
    }

    @Override
    List<Double> getOutput() {
        List<Double> outputs = new ArrayList<>();
        for (Neuron neuron : neurons) {
            outputs.add(neuron.getOutput());
        }
        return  outputs;
    }

    @Override
    void setInput(List<Double> inputs) {
        for(int i = 0; i < inputs.size(); i++) {
            for (Neuron neuron : neurons) {
                neuron.setOutput(inputs.get(i));
            }
        }
    }
}
