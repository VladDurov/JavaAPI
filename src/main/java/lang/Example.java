package lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

    private static StringBuffer sb = new StringBuffer("start");

    public void stringBuffer() throws IOException {
        sb.append(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(sb.toString());
    }


    private static void metodwithstr(String str) {
        for (String s : str.split("-")) System.out.println(s);
        for (Character s : str.toCharArray()) System.out.println(s);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        //Example.stringBuffer();
        Example.metodwithstr("vlad-durov");
        try {
            Example.sum();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void sum() throws ArithmeticException {

        System.out.println((5 / 0));
        new Exception("" + (5 / 0));

    }


}
