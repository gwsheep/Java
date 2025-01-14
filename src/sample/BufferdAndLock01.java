package sample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static sample.BufferedConst.FILE_NAME;

public class BufferdAndLock01 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(FILE_NAME);
//        BufferedInputStream bis = new BufferedInputStream(fis);
        long start = System.currentTimeMillis();

        byte[] buffer = fis.readAllBytes();


//        int filesize = 0;
//        int data;
//        while((data = bis.read()) != -1) {
//            filesize++;
//        }

        long end = System.currentTimeMillis();


    }
}
