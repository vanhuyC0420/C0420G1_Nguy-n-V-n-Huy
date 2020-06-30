package io_text_file.thuc_hanh2;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static final String PATH = "src/io_text_file/thumuc";
    public static void main(String[] args) {
        File dir = new File(PATH);  /**Tạo đối tượng File trỏ tới đường dẫn*/
        dir.mkdir();    /**Tạo thư mục nếu đường dẫn không tồn tại*/
        File file = new File(PATH,"document.txt");      /**Tạo đối tượng File trỏ tới đường dẫn*/
        try {
            //Tạo file
            if (file.createNewFile()){
                System.out.println("File created..");
            }else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Liệt kê nội dung thư mục
        if (dir.isDirectory()){
            String[] dirContent = dir.list();
            for (int i = 0; i < dirContent.length; i++ ){
                System.out.println(dirContent[i]);
            }
        }
    }
}
