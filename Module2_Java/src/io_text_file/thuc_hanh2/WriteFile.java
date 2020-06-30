package io_text_file.thuc_hanh2;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static final String PATH = "src/io_text_file/thumuc/text.txt";

    public static void main(String[] args) {
        FileWriter writer = null;
        try{
            writer = new FileWriter(PATH);
            writer.write("Đà nẵng!");
            writer.write("Chào mừng: ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
