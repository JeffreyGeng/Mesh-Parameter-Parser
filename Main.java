import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //undertray parse
        UndertrayParse uparse = new UndertrayParse("/Users/Jeffrey/Library/CloudStorage/OneDrive-TheUniversityofTexasatAustin/Docs/LHR Ansys/undertrayParamsCSV.csv", 20, 1.2);
        uparse.undertrayParse();
    }

}
