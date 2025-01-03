package exam;

import java.util.List;

public abstract class AbstractLayer {
    abstract void forward();
    abstract List<Double> getOutput();
    abstract void setInput(List<Double> inputs);
}
