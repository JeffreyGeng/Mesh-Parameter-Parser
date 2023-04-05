public class Row {
    //dp - Design Point
    //P3 - Mesh Element Size [mm]
    // P4 - Edge Sizing Element Size [mm]
    // P5 - Edge Sizing 2 Element Size [mm]
    // P6 - Inflation Maximum Layers
    // P7 - Inflation First Layer Height [mm]
    // P8 - Face Sizing Element Size [mm]
    // P9 - Face Sizing 2 Element Size [mm]
    // P10 - cda-op
    // P11 - cla-op
    // P12 - cop-op
    String dp;
    double p3;
    double p4;
    double p5;
    double p6;
    double p7;
    double p8;
    double p9;
    double p10;
    double p11;
    double p12;
    double p13;


    public Row(String[] data){
        dp = data[0];
        p3 = Double.valueOf(data[1]);
        p4 = Double.valueOf(data[2]);
        p5 = Double.valueOf(data[3]);
        p6 = 0.0;
        //p6 = Double.valueOf(data[4]);
        p7 = Double.valueOf(data[5]);
        p8 = Double.valueOf(data[6]);
        p9 = Double.valueOf(data[7]);
    }
}
