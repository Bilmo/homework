package lesson18;

import java.io.*;

/**
 * Created by student on 2/25/2018.
 */
public class BufferWri {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\lesson18\\buffer"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson18\\newF"))) {
            String srt;
            while ((srt = reader.readLine()) != null) {
                writer.write(srt);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
