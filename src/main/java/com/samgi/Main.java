package com.samgi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader keybaordReader = null;
        try {
            System.out.printf("Hello and welcome!");

            keybaordReader = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                String message = keybaordReader.readLine();
                System.out.printf("입력된 문자열 : [%s]\n", message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (keybaordReader != null) {
                    keybaordReader.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
