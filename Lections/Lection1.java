package Lections;

import java.io.File;
import java.util.HashMap;

public class Lection1 {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("file.txt")));
        System.out.println(divide(10, 0));
    }

    public static double divide(int a1, int a2){
        if (a2 == 0){
            throw new RuntimeException("Divide by zero not permited");
        }
        return a1/a2; 
    }

    public static long getFileSize(File file){
        if (!file.exists()){
            return -1;
        }
        return file.length();
    }
}
