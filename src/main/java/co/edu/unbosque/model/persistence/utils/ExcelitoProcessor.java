package co.edu.unbosque.model.persistence.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExcelitoProcessor {

    private File excelito;

    public ExcelitoProcessor(File excelito) {
        this.excelito = excelito;
    }

    public String[] read() throws IOException {
        var line = Files.readString(Path.of(excelito.getAbsolutePath()), StandardCharsets.UTF_8).split("\n");
        return line;
    }

}
