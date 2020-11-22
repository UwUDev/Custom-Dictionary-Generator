package me.uwu.gen.utils;

import java.io.*;
import java.util.Scanner;

public class GenUtils {

    public static String[] getKeywords(){
        String keywords = null;

        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                keywords = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("oof ca bug");
            e.printStackTrace();
        }

        return keywords.split(" ");
    }

    public static void saveResult(StringBuilder sb){
        try {
            File myObj = new File("output.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.append(sb);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
