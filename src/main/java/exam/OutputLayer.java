package exam;

import java.util.List;

public class OutputLayer extends AbstractLayer {
    private Layer layer;

    @Override
    void forward() {

    }

    @Override
    List<Double> getOutput() {
        return layer.getOutput();
    }
}
