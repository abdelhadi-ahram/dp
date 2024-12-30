package exam;

import java.util.List;

public class HiddenLayer extends AbstractLayer {
    private List<Layer> layers;

    HiddenLayer(int layersCount, int neuronCount, ActivationFunction activationFunction) {
        for (int i = 0; i < layersCount; i++) {
            layers.add(new Layer(neuronCount, activationFunction));
        }
    }

    @Override
    void forward() {
        System.out.println("Forwarding hidden layer");
    }

    @Override
    List<Double> getOutput() {
        Layer lastLayer = layers.get(layers.size() - 1);
        return lastLayer.getOutput();
    }

    @Override
    void setInput(List<Double> inputs) {
        Layer firstLayer = layers.get(0);
        firstLayer.setInput(inputs);
        for(int i = 1; i < layers.size(); i++) {
            Layer previousLayer = layers.get(i - 1);
            Layer currentLayer = layers.get(i);
            currentLayer.setInput(previousLayer.getOutput());
        }
    }
}
