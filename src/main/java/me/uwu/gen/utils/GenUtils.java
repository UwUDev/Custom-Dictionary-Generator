package me.uwu.gen.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        try {
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(sb.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
