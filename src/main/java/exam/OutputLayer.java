package exam;

import java.util.List;

public class OutputLayer extends AbstractLayer {
    private Layer layer;

    OutputLayer(int neuronCount, ActivationFunction activationFunction) {
        layer = new Layer(neuronCount, activationFunction);
    }

    @Override
    void forward() {

    }

    @Override
    List<Double> getOutput() {
        return layer.getOutput();
    }

    @Override
    void setInput(List<Double> inputs) {

    }
}
