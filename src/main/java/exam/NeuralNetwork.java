package exam;

public class NeuralNetwork {
    private AbstractLayer[] nnLayers;
    private ActivationFunction activateFunction;

    NeuralNetwork() {
        activateFunction = new Sigmoid();
        InputLayer inputLayer = new InputLayer(2, activateFunction);
        HiddenLayer hiddenLayer = new HiddenLayer(4, 3, activateFunction);
        OutputLayer outputLayer = new OutputLayer(2, activateFunction);
    }

}
