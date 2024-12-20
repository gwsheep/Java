package sample;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput01 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("sample/hello.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            bos.write(1);
        }
        bos.close();
        long endTime = System.currentTimeMillis();
        System.out.println("total = " + (endTime - startTime) + " ms");
        fos.close();
    }

}
