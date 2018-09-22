package com.io;

import java.io.*;

/*
 Copy One File To Another
 */
public class Sample2 {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            FileReader fr = new FileReader(
                    new File("C:\\Users\\Pavan\\Desktop\\MyTestFile.txt"));

            br = new BufferedReader(fr);

            fw = new FileWriter(
                    new File("C:\\Users\\Pavan\\Desktop\\MyTestFile1.txt"));
            bw = new BufferedWriter(fw);

            while (br.ready()) {
                bw.write(br.readLine());
            }

            bw.flush();
            fw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
