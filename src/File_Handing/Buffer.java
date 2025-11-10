package File_Handing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {
        String name = "D:\\Learning\\Java_Course\\src\\File_Handing\\index.txt";
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(name));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // This block will always run, even if an exception occurs
            try {
                if (br != null) {
                    br.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
