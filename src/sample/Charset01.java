package sample;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Charset01 {


    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        byte[] bytes = encoding("A", StandardCharsets.UTF_16BE);
        String str = decoding(bytes, StandardCharsets.US_ASCII);
        System.out.println(str);    //에러
    }

    public static byte[] encoding(String text, Charset charset) {
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] -> %s, %d\n", text, charset, Arrays.toString(bytes), bytes.length);
        return bytes;
    }

    public static String decoding(byte[] bytes, Charset charset) {
        return new String(bytes, charset);
    }





}
