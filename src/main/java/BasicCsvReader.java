import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class BasicCsvReader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("/home/badmusamuda/Documents/backup/oysec/apis_data_jobs.csv"));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("_id", "pillarNumber").withIgnoreHeaderCase().withTrim());

        for (CSVRecord csvRecord: csvParser) {

            // Accessing Values by Column Index
            String _id = csvRecord.get(0);

            //Accessing the values by column header name
            String pn = csvRecord.get("pillarNumber");

            //Printing the record 
            System.out.println("Record Number - " + csvRecord.getRecordNumber());
            System.out.println("ID : " + _id);
            System.out.println("Pillar Number : " + pn);
            System.out.println("\n\n");
        }
    }
}
