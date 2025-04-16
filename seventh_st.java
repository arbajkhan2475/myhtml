
import java.io.*;

// Read a File

public class seventh_st {

    public static void main(String[] args) throws Exception {

        FileReader a = new FileReader("Arbaj.txt");

        int i;

        while ((i = a.read()) != -1) {

            System.out.print((char) i); // Typescasting

        }

    }

}
