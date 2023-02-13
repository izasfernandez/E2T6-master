
//gggggg
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         * String text = "9|pepe|3||14/02/17";
         * String[] parts = text.split("\\|");
         * for (String part : parts) {
         * System.out.println(part);
         * }
         */
        taulaGorde("../ErronkaTaulak/BEZERO_DATA_TABLE.tsv");
    }

    public static void taulaGorde(String taula) {
        try {
            String aux = null;
            File f = new File(taula);
            Scanner sf = new Scanner(f);
            FileWriter fw = new FileWriter("pruevas2.txt");
            PrintWriter pw = new PrintWriter(fw);
            String[] arrayTaula = new String[0];
            while (sf.hasNext()) {
                arrayTaula = Arrays.copyOf(arrayTaula, arrayTaula.length + 1);
                arrayTaula[arrayTaula.length - 1] = sf.nextLine().split("\\|");
                System.out.println(arrayTaula.toString());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        /*
         * try {
         * String aux = null;
         * File f = new File("pruevas.txt");
         * Scanner sf = new Scanner(f);
         * FileWriter fw = new FileWriter("pruevas2.txt");
         * PrintWriter pw = new PrintWriter(fw);
         * while (sf.hasNext()) {
         * aux = sf.next();
         * for (int x = 0; x < 7; x++) {
         * pw.print(aux);
         * }
         * 
         * }
         * sf.close();
         * fw.close();
         * } catch (Exception e) {
         * System.out.println("Error al interactuar con el archivo");
         * }
         */

    }

}