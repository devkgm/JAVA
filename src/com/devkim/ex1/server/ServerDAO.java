package com.devkim.ex1.server;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ServerDAO {
    // get
    public ArrayList<String> getWeathers() throws Exception {
        File file = new File("C:\\temp\\weatherData.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();
        ArrayList<String> arrayList = new ArrayList<>();
        string = bufferedReader.readLine();
        while (string != null) {

            StringTokenizer stringTokenizer = new StringTokenizer(string, "-");
            while (stringTokenizer.hasMoreTokens()) {
                arrayList.add(stringTokenizer.nextToken());
            }
            string = bufferedReader.readLine();
            System.out.println(string);
        }
        bufferedReader.close();
        return arrayList;
    }
}
