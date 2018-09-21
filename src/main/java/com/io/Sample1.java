package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
Write data to a file
*/

public class Sample1 {

    public static void main(String[] args) {
        OutputStream opStream = null;
        try {
            String strContent = "This example shows how to write byte content to a file";
            byte[] byteContent = strContent.getBytes();

            File myFile = new File("C:\\Users\\Pavan\\Desktop\\MyTestFile.txt");
            opStream = new FileOutputStream(myFile);
            opStream.write(byteContent);
            opStream.flush();

            System.out.println("Successfully written ");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (opStream != null)
                    opStream.close();
            } catch (Exception ex) {

            }
        }
    }
}
