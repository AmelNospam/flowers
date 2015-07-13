/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedures;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Олексій
 */
public class Task1 {

    public static void main(String... args) throws FileNotFoundException, IOException {
        HashMap holidays = new HashMap();
//        NavigableMap holidays = (NavigableMap) new HashMap();
//        if (args.length == 0) {
//            System.out.println("Вы должны указать параметры для выполнения:");
//            System.out.println("    1 - путь к файлу с праздниками");
//            System.exit(1);
//        }
//        fname = args[0];
        String fname = "D:\\holidays.txt";
//        File file = new File(fname);
//        FileInputStream fs = new FileInputStream(file);
//        DataInputStream is = new DataInputStream(fs);

        char ch = '\0';

        Path path = Paths.get(fname);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (String line : lines) {
            String dt = "";
            for(int index = 8; index < 11; index++){
                String tmp = line[index];
                if (" ".equals(tmp)) {
                    dt = line.substring(0, index-1);
                }
            }
            if(dt.equals("")) {
                System.out.println("Not found in str: "+line);
                continue;
            }
            holidays.put(dt, line.substring(dt.length()+2));
        }
        System.out.println("holidays:");
        System.out.println(holidays);
    }
}
