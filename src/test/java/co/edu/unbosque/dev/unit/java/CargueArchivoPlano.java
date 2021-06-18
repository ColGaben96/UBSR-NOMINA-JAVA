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
            assertEquals("5001", emps[0].split(",")[0]);

        } catch (IOException e) {
            assertEquals("IOException", e.getMessage());
        }

    }
    @Test
    public void insertar2Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File("./lib/NominaEmpleados.csv"));
        try {
            var emps = excelito.read();
            assertEquals("5001", emps[0].split(",")[0]);
            assertEquals("5002", emps[1].split(",")[0]);

        } catch (IOException e) {
            assertEquals("IOException", e.getMessage());
        }

    }
    @Test
    public void insertar10Emp() {
        ExcelitoProcessor excelito = new ExcelitoProcessor(new File("./lib/NominaEmpleados.csv"));
        try {
            var emps = excelito.read();
            assertEquals("5001", emps[0].split(",")[0]);
            assertEquals("5002", emps[1].split(",")[0]);
            assertEquals("5003", emps[2].split(",")[0]);
            assertEquals("5004", emps[3].split(",")[0]);
            assertEquals("5005", emps[4].split(",")[0]);
            assertEquals("5006", emps[5].split(",")[0]);
            assertEquals("5007", emps[6].split(",")[0]);
            assertEquals("5008", emps[7].split(",")[0]);
            assertEquals("5009", emps[8].split(",")[0]);
            assertEquals("5010", emps[9].split(",")[0]);

        } catch (IOException e) {
            assertEquals("IOException", e.getMessage());
        }

    }
}
