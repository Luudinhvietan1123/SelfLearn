package DiepTranVanJavaNangCao;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lesson3_NhapDuLieu {
    public static void main(String[] args) {
        //nhap du lieu cach 1
        Scanner scanner = new Scanner(System.in);
        //nhap du lieu cach 2: InputStream la danh cho string hay char, neu muon dung int thi phai ep kieu
        DataInputStream inputStream = new DataInputStream(System.in);
        try {
            System.out.println("Nhap ki tu bat ki: ");
            String n = inputStream.readLine();
            System.out.println(n);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
        }
    }
}
