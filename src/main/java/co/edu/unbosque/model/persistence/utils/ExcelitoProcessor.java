package co.edu.unbosque.model.persistence.utils;

import java.io.*;

public class ExcelitoProcessor {

    private File excelito;

    public ExcelitoProcessor(File excelito) {
        this.excelito = excelito;
    }

    public String[] read() throws IOException, ClassNotFoundException {
        FileReader fr = new FileReader(excelito);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null) {
            line += br.readLine();
        }
        return line.contains(",") ? line.split(",") : line.split(";");
    }

}
