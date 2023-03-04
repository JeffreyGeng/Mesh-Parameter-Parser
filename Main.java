import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //undertray parse
        //UndertrayParse uparse = new UndertrayParse("/Users/Jeffrey/Library/CloudStorage/OneDrive-TheUniversityofTexasatAustin/Docs/LHR Ansys/undertrayParamsCSV.csv");
        //uparse.undertrayParse();

        LayersCalculator calc = new LayersCalculator(20, 1.2);
        int layers = calc.calculateLayers(5.6432);
        System.out.println(layers);

    }

}
