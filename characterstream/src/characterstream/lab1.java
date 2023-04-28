package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class lab1 {


    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("HelloWorld! ");
            output.write("This is Java");
            output.close();


        } catch (IOException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            int ch;
            FileReader input = new FileReader("data.txt");
            while ((ch = input.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}