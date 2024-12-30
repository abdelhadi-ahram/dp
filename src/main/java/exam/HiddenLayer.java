package exam;

import java.util.List;

public class HiddenLayer extends AbstractLayer {
    private List<Layer> layers;

    @Override
    void forward() {
        System.out.println("Forwarding hidden layer");
    }

    @Override
    List<Double> getOutput() {
        Layer lastLayer = layers.get(layers.size() - 1);
        return lastLayer.getOutput();
    }
}
