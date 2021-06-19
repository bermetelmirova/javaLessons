package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args)throws IOException {
        ArrayList <String > input = new ArrayList<>();
        input.addAll( reader("input.txt"));
        ArrayList <String > pattern = new ArrayList<>();
        pattern.addAll( reader("pattern.txt"));
        ArrayList <String > result = new ArrayList<>();
        ArrayList <String > result2 = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < pattern.size(); j++) {
                if(input.get(i).contains(pattern.get(j))){
                    System.out.println(input.get(i));
                }
            }

        }
    }
    static List<String> reader(String nameFile)throws IOException{
        FileReader fileReader = new FileReader(nameFile);
        Scanner scanner = new Scanner(fileReader);
        ArrayList <String > input = new ArrayList<>();
        while(scanner.hasNextLine()){
            input.add(scanner.nextLine());
        }
        fileReader.close();
        return input;
    }
}