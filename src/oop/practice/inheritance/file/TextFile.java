package oop.practice.inheritance.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class TextFile extends File {
    public TextFile(String path) {
        super(path);
    }

    public void createFile() throws IOException {
        boolean isCreated = this.createNewFile();
        if (isCreated) {
            System.out.println("File is created: " + this.getName());
        } else {
            System.out.println("File is exist: " + this.getName());
        }
    }

    public void renameFile(String newName) throws IOException {
        File renamedFile = new File(this.getParent(), newName);
        boolean isRenamed = this.renameTo(renamedFile);
        if (isRenamed) {
            System.out.println("File is renamed. New name is: " + renamedFile.getName());
            return;
        } else {
            System.out.println("Failed to rename file " + this.getName());
        }
    }

    public void deleteFile() {
        boolean isDeleted = this.delete();
        if (isDeleted) {
            System.out.println("File " + this.getName() + " is deleted.");
        } else {
            System.out.println("File " + this.getName() + " is not deleted.");
        }
    }

    public void append(String text) throws IOException {
        if (this.exists()) {
            Files.writeString(this.toPath(), text, StandardOpenOption.APPEND);
            System.out.println("Text was added to file " + this.getName());
        } else {
            System.out.println("File is not exist " + this.getName());
        }
    }

    public void printContent() throws IOException {
        if (this.exists()) {
            String content = Files.readString(this.toPath());
            if (!content.isEmpty()) {
                System.out.println("File " + this.getName() + " content is:\n" + content + "\n");
            } else {
                System.out.println("File " + this.getName() + " content is:\nEMPTY\n");
            }
        } else {
            System.out.println("Cant print file, file " + this.getName() + " is not exist.\n");
        }
    }
}
