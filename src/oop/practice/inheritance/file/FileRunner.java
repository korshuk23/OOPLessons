package oop.practice.inheritance.file;

import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("D:\\test\\test.txt");
        try {
            textFile.createFile();
            textFile.printContent();

            textFile.append("\"Add some info in text file\"");
            textFile.printContent();

            textFile.deleteFile();
            textFile.createFile();
            textFile.printContent();

            textFile.renameFile("newName.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
