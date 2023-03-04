public class Row {
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


    public Row(String[] data){
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
