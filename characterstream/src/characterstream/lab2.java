package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab2 {

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);

            output.write("HelloWorld!");
            output.write("This is Java");
            output.close();
        }

        catch (IOException ex) {
            Logger.getLogger(lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String s;
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            while ((s = input.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}