package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textReader {

    private DashaMap1 mapOne;
    private DashaMap2 mapTwo;
    private DashaMap3 mapThree;

    public void readFile(){
        mapOne = new DashaMap1();
        mapTwo = new DashaMap2();
        mapThree = new DashaMap3();
        String filePath = "word-list.txt";
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(" ");
                if (parts.length >= 2){
                    String key = parts[0];
                    Integer value = Integer.parseInt(parts[1]);
                    mapOne.set(key, value);
                    mapTwo.set(key, value);
                    mapThree.set(key, value);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public DashaMap1 getMapOne() {
        return mapOne;
    }

    public DashaMap2 getMapTwo() {
        return mapTwo;
    }

    public DashaMap3 getMapThree() {
        return mapThree;
    }
}
