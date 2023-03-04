import java.io.*;

public class UndertrayParse {
    String csvFile;
    String line = "";
    String csvSplitBy = ",";
    String[] data;
    String csvFilename = "undertray_output.csv";

    public UndertrayParse(String fileLocation)
    {
        csvFile = fileLocation;
    }

    public void undertrayParse() throws IOException
    {
        // Create a BufferedWriter to write to the CSV file
        BufferedWriter csvWriter = new BufferedWriter(new FileWriter(csvFilename));

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            line = br.readLine();
            csvWriter.write(line);
            csvWriter.newLine();

            line = br.readLine();
            csvWriter.write(line);
            csvWriter.newLine();

            line = br.readLine();
            csvWriter.write(line);
            csvWriter.newLine();

            line = br.readLine();
            csvWriter.write(line);
            csvWriter.newLine();

            line = br.readLine();
            csvWriter.write(line);
            csvWriter.newLine();

            line = br.readLine();
            csvWriter.write(line);
            csvWriter.newLine();

            line = br.readLine();
            csvWriter.write(line);
            csvWriter.newLine();

            while ((line = br.readLine()) != null) {

                // use comma as separator
                data = line.split(csvSplitBy);

                // create a new Row object for this row
                Row row = new Row(data);

                //conditions that will delete a row

                //if general body sizing < BOI far
                if(row.p3 < row.p9)
                {
                    continue;
                }

                //if BOI far < BOI near
                if(row.p9 < row.p8)
                {
                    continue;
                }

                //if BOI near < ES2
                if(row.p8 < row.p5)
                {
                    continue;
                }

                //if ES2 < initial layer height
                if(row.p5 < row.p7)
                {
                    continue;
                }

                //if ES2 < ES1
                if(row.p5 < row.p4)
                {
                    continue;
                }

                //if none of these conditions hit, print
                csvWriter.write(line);
                csvWriter.newLine();
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        // Close the BufferedWriter object
        csvWriter.close();
        System.out.println("Undertray file parsed.");
    }





}
