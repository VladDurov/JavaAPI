package io;

import java.io.*;
import java.util.Map;

public class InputOutputToFile {

    public static void readFile(String pathToFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathToFile));
        String str;
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
    }

    public static void writeFile(String pathToFile) throws IOException {
        File nf = new File(pathToFile);
        if (!nf.isFile()){
           nf.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile));
        for(Map.Entry e: System.getenv().entrySet()){
            bw.write(""+e+"\n");
        }
        bw.close();
        InputOutputToFile.readInputWriteToFile(pathToFile);
        InputOutputToFile.readFile(pathToFile+".txt");
    }


    public static void readInputWriteToFile(String pathToFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathToFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile+".txt"));

        String str;
        while ((str = br.readLine())!=null){
            System.out.println(str);
            bw.write(""+str+"\n");
        }

        br.close();



      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            String nextLine=reader.readLine();
            if(nextLine.equals("exit")) break;
            bw.write(nextLine);
        }

        reader.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
             InputOutputToFile.writeFile("D:\\env.txt");
    }

}



