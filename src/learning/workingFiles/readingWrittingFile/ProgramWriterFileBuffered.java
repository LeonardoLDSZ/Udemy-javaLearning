package workingFiles.readingWrittingFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriterFileBuffered {
    public static void main (String [] args) {
        String[] lines = new String[] {"Bom dia", "Good afternoon", "Good Night"};
        String path = "C:\\Users\\note-novo\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
