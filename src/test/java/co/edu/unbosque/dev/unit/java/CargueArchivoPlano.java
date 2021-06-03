package co.edu.unbosque.dev.unit.java;

import co.edu.unbosque.model.persistence.utils.ExcelitoProcessor;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CargueArchivoPlano {
    @Test
    public void insertar1Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File("./lib/NominaEmpleados.csv"));
        try {
            var emps = excelito.read();
            assertEquals("5001", emps[0].split("\n")[0]);

        } catch (IOException e) {
            assertEquals("IOException", e.getMessage());
        }

    }
    @Test
    public void insertar2Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File(""));

    }
    @Test
    public void insertar10Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File(""));

    }
    @Test
    public void insertar50Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File(""));

    }
    @Test
    public void insertar100Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File(""));

    }
    @Test
    public void insertar200Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File(""));

    }
}
