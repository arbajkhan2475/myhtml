
// File Handling

// Create a File

import java.io.File;

public class fifth_st {

    public static void main(String[] args) {

        File a = new File("Arbaj.txt"); // txt is a extension

        try {

            if (a.createNewFile()) {

                System.out.println("File Created Successfully.");
            }

            else {

                System.out.println("Does Not Create a File....");
            }
        }

        catch (Exception e) {

            System.out.println("Error - File mein error aa gaya !!!!!!");
        }

    }

}
