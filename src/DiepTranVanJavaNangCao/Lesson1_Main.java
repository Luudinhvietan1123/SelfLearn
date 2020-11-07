package DiepTranVanJavaNangCao;

import java.util.Scanner;

public class Lesson1_Main {
    public static void main(String[] args) {
        int [] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        try{
            for(int i = 0; i <= arr.length; i++){
                System.out.printf("Moi nhap phan tu thu %d:", i+1);
                arr[i] = scanner.nextInt();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Continuous!!");
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(i);
        }
    }
}
