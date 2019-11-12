package com.gradess.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

//        while (true) {

            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "\"E:\\SyncToy\\SyncToyCmd.exe\" -R Models_Pair");
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }

                System.out.println(line);
            }

        System.out.println(process.exitValue());
//            Thread.sleep(500);
//        }
    }
}