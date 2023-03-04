public class LayersCalculator {
    double totalHeight;
    double growthRate;

    public LayersCalculator(double wantedHeight, double inputGrowthRate)
    {
        totalHeight = wantedHeight;
        growthRate = inputGrowthRate;
    }

    public int calculateLayers(double firstLayerHeight)
    {
        int layers = 0;
        double total = firstLayerHeight;
        double previousLength = firstLayerHeight;
        double newLength;

        while(total <= totalHeight)
        {
            newLength = previousLength * growthRate;
            total += newLength;
            previousLength = newLength;
            layers++;
        }
        return layers;
    }


}
