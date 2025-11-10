package File_Handing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("D:\\Learning\\Java_Course\\src\\File_Handing\\index.txt");
            FileOutputStream out = new FileOutputStream("D:\\Learning\\Java_Course\\src\\File_Handing\\output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied successfully!");
            in.close();
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}