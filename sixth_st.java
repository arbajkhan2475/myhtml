
import java.io.FileWriter;

// Write Opeartion

public class sixth_st {

    public static void main(String[] args) {

        try {

            FileWriter a = new FileWriter("Arbaj.txt");

            try {

                a.write("Hello I am Arbaj Khan ....");

            }

            finally {

                a.close();
            }

        }

        catch (Exception e) {

            System.out.println("Error - File mein error aa gaya !!!!!!");
        }

    }

}
