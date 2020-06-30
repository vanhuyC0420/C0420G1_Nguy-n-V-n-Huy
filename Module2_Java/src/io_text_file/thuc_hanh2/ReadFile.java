package io_text_file.thuc_hanh2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static final String LINK = "src/io_text_file/thumuc/text.txt";

    public static void main(String[] args){
        FileReader file = null;
        BufferedReader buffere = null;
        try {
            file = new FileReader(LINK);
            buffere = new BufferedReader(file);
            StringBuffer result = new StringBuffer();
            String line = null;
            while ((line = buffere.readLine()) != null){
                result.append(line);
            }
            System.out.println(result);
            buffere.close();
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
