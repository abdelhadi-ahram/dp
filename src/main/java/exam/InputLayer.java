package exam;

import java.util.List;

public class InputLayer extends AbstractLayer {
    private Layer layer;

    public InputLayer(int neuronCount, ActivationFunction activationFunction) {
        layer = new Layer(neuronCount, activationFunction);
    }

    @Override
    public void setInput(List<Double> inputs) {
        layer.setInput(inputs);
    }

    @Override
    void forward() {
        System.out.println("Forwarding input layer");
    }

    @Override
    List<Double> getOutput() {
        return layer.getOutput();
    }
}
