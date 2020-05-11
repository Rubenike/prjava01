package prjava01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rubenike1718daw2vid
 */
public class Prjava01 {

    public static void main(String[] args) throws IOException {

        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine(); bw.write("  <head>");bw.newLine(); bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina  web");bw.newLine();
            bw.write("    </title>");bw.newLine(); bw.write("  </head>");bw.newLine(); bw.write("  <body>");bw.newLine();
            bw.write("    <h1>DAM2 m05uf2pr4</h1>");bw.newLine();
            bw.write("    Nova p&agrave;gina web");bw.newLine(); bw.write("  </body>");bw.newLine(); bw.write("</html>");bw.newLine();
            bw.close();
        }
    } 
}
