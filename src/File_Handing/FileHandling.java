package File_Handing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    private File file;

    public FileHandling(String fileName) {
        this.file = new File(fileName);
    }

    public void createFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public void writeFile(String content) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file: " + file.getName());
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void readFile() {
        try (Scanner reader = new Scanner(file)) {
            System.out.println("Content of file " + file.getName() + ":");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: File not found.");
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}