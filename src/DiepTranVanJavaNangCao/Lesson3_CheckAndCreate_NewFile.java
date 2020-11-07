package DiepTranVanJavaNangCao;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lesson3_CheckAndCreate_NewFile {
    public static void main(String[] args){
        File file = new File("test.txt");
        if(file.isFile()){
            System.out.println(file.getAbsolutePath());
        }else{
            try{
                file.createNewFile();
                System.out.println(file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                file.delete();
            }
        }

    }
}
