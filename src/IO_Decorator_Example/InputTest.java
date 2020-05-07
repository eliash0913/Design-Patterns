package IO_Decorator_Example;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        String currentDirectory = System.getProperty("user.dir") + "\\src\\IO_Decorator_Example\\";

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(currentDirectory+"test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
