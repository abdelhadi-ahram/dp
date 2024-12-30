package exam;

import java.util.List;

public class InputLayer extends AbstractLayer {
    private Layer layer;

    @Override
    void forward() {
        System.out.println("Forwarding input layer");
    }

    @Override
    List<Double> getOutput() {
        return layer.getOutput();
    }
}
